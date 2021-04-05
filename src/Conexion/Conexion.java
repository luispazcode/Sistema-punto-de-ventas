package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author porta
 */
public class Conexion {
    //Declaración de nuevas variables
    private String db = "punto_de_ventas";
    private String user = "root";
    private String password = "";
    private String urlSql = "jdbc:sqlserver://localhost:1433;databaseName=" + db + ";integratedSecurity=true;";
    private Connection conn = null;
    
    //Metodo Conexion
    public Conexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(urlSql);
            if (conn != null) {
                System.out.println("Conexion a la base de datos " + this.db + "...... Listo");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error : " + ex);
        }
    }
    //Constructor conecction
    public Connection getConn() {
        return conn;
    }

}
