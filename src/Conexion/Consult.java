package Conexion;

import Models.TClientes;
import Models.TConfiguration;
import Models.TReportes_clientes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author porta
 */
public class Consult extends Conexion {

    private QueryRunner QR = new QueryRunner();

    public List<TClientes> clientes() {
        List<TClientes> cliente = new ArrayList();
        try {

            cliente = (List<TClientes>) QR.query(getConn(), "SELECT * FROM tclientes", new BeanListHandler(TClientes.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        return cliente;
    }

    // Metodo reporte clientes
    public List<TReportes_clientes> reportesClientes() {
         String where = "";
        List<TReportes_clientes> reportes = new ArrayList();
         String condicion = " TClientes.ID = TReportes_clientes.IdCliente ";
        String campos = " TClientes.ID,TClientes.Nid,TClientes.Nombre,TClientes.Apellido,"
                + "TReportes_clientes.IdRegistro,TReportes_clientes.DeudaActual,"
                + "TReportes_clientes.FechaDeuda,TReportes_clientes.UltimoPago,"
                + "TReportes_clientes.FechaPago, TReportes_clientes.Ticket,"
                + "TReportes_clientes.FechaLimite";
        try{
            reportes = (List<TReportes_clientes>) QR.query(getConn(),
                    "SELECT" + campos + " FROM treportes_clientes Inner Join tclientes ON"
                    + condicion + where, new BeanListHandler(TReportes_clientes.class));
        }catch (SQLException ex) {
            System.out.println("Error : " + ex);
        }
        return reportes;
    }
    //NUEVAS CONSULTAS
    
    //METODO CONFIG, QUE RETORNARA UNA COLECCION DE OBJETOS DE LA CLASE LIST QUE VA A CONTENER UNA COLECCION DE OBJETOS DE LA CLASE TCONFIGURATION...
    public List<TConfiguration> config(){
        List<TConfiguration> config = new ArrayList();
        try {
            config = (List<TConfiguration>) QR.query(getConn(), "SELECT * FROM tconfiguration",
                    new BeanListHandler(TConfiguration.class));
        }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : "+ ex);
        }
        return config;
    }
}
