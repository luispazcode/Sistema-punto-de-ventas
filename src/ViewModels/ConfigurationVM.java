/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import Conexion.Consult;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Edgar
 */
public class ConfigurationVM extends Consult {
//ATRIBUTO 

    public static String Mony;
    private static List<JRadioButton> _radio;
//METODO CONSTRUCTOR

    public ConfigurationVM() {
        TypeMoney();
    }

    public ConfigurationVM(List<JRadioButton> radio) {
        _radio = radio;
        RadioEvent();
        TypeMoney();
    }

    private void RadioEvent() {
        _radio.get(0).addActionListener((ActionEvent e) -> {
            TypeMoney("S/.", _radio.get(0).isSelected());
        });
        _radio.get(1).addActionListener((ActionEvent e) -> {
            TypeMoney("$.", _radio.get(0).isSelected());
        });
    }

    private void TypeMoney() {
    }

    private void TypeMoney(String typeMoney, boolean valor) {

    }
}
