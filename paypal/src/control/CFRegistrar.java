/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import paypal.Datos;
import vista.FPrincipal;
import vista.FRegistrar;

/**
 *
 * @author Ioan Alexandru Stanica
 * @version 1.10 07/02/2023
 * @deprecated A partir de la versión 1.1
 */
//public class CFRegistrar implements ActionListener {
//
//    private FRegistrar finestra;
//    private Datos datos;
//
//    public CFRegistrar(FRegistrar finestra) {
//        this.finestra = finestra;
//        datos = new Datos();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        switch (e.getActionCommand()) {
//            case "Crear la cuenta":
//                if (finestra.cumpleDatos()) {
//                    datos.setUsuario(finestra.getUsuario());
//                    datos.setContraseña(finestra.getContraseña());
//                    JOptionPane.showMessageDialog(finestra, "Ya esta creado la cuenta");
//                    FPrincipal ventana = new FPrincipal();
//                    ventana.setVisible(true);
//                } else {
//                    JOptionPane.showMessageDialog(finestra, "Error");
//                }
//                break;
//            case "Cancelar":
//                if (JOptionPane.showConfirmDialog(finestra, "¿Desea cancelar?",
//                        "Cancelar", JOptionPane.ERROR_MESSAGE) == JOptionPane.ERROR_MESSAGE) {
//                    FPrincipal ventana = new FPrincipal();
//                    ventana.setVisible(true);
//                }
//                break;
//            default:
//                throw new AssertionError();
//        }
//    }
//
//}
