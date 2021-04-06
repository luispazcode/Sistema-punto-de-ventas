

//EN ESTA CLASE SE FORMATEARA LOS DATOS DE TIPO DOUBLE PARA CONVERTIRLOS EN DATOS O FORMATO
// DE TIPO MONEY PARA PODER AGREGAR LOS PUNTOS DECIMALES Y COMAS A LAS CANTIDADES
package Library;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 *
 * @author Edgar
 */
//OBJETO DE LA CLASE DECIMAL FORMAT 
public class FormatDecimal {
    DecimalFormat formateador = new DecimalFormat ("###,###,##0.00");
    Number numero;
//METODO QUE RETORNARA UN DATO TIPO STRING
    public String decimal(double formato){
        return formateador.format(formato);
    }
//METODO REVERTIDO
    public double reconstruir(String formato){
        try {
            numero = formateador.parse(formato.replace(" ", ""));
        } catch (ParseException ex) {
            System.out.println("Error : " + ex);
        }
        return numero.doubleValue();
    }
}
