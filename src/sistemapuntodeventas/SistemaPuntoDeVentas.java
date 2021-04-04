/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapuntodeventas;

import Views.Sistema;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author LUISPAZCORDOVA
 */
public class SistemaPuntoDeVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            
        } 
        Sistema sistema = new Sistema();
        sistema.setExtendedState(MAXIMIZED_BOTH);
        sistema.setVisible(true);
        
    }
    
}
