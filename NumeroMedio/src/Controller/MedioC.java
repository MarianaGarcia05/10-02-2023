/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.MedioM;
import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class MedioC {

    MedioM medioM = new MedioM();

    public void Agregar(double Numero1, double Numero2, double Numero3) {
        try {
            if (Numero1 >= 0) {
                if (Numero2 >= 0) {
                    if (Numero3 >= 0) {
                        JOptionPane.showMessageDialog(null, "Se enviaron los datos correctamente.");
                        medioM.setNumero1(Numero1);
                        medioM.setNumero2(Numero2);
                        medioM.setNumero3(Numero3);
                        medioM.NumeroMedio();
                    } else {
                        JOptionPane.showMessageDialog(null, "Dato no valido.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Dato no valido.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Dato no valido.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
    }

    public double[] Mostrar() {
        double data[] = new double[1];

        try {
            if (medioM.getMedio() != 0) {
                JOptionPane.showMessageDialog(null, "Se calculo correctamente.");
                data[0] = medioM.getMedio();
            } else {
                JOptionPane.showMessageDialog(null, "No se ha efectuado el calculo.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
        return data;

    }
}
