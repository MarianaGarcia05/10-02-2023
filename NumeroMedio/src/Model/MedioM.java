/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class MedioM {

    private double Numero1;
    private double Numero2;
    private double Numero3;
    private double Medio;

    public MedioM() {
    }

    public MedioM(double Numero1, double Numero2, double Numero3, double Medio) {
        this.Numero1 = Numero1;
        this.Numero2 = Numero2;
        this.Numero3 = Numero3;
        this.Medio = Medio;
    }

    public double getNumero1() {
        return Numero1;
    }

    public void setNumero1(double Numero1) {
        this.Numero1 = Numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double Numero2) {
        this.Numero2 = Numero2;
    }

    public double getNumero3() {
        return Numero3;
    }

    public void setNumero3(double Numero3) {
        this.Numero3 = Numero3;
    }

    public double getMedio() {
        return Medio;
    }

    public void setMedio(double Medio) {
        this.Medio = Medio;
    }

    public void NumeroMedio() {
        if ((this.Numero1 > this.Numero2 && this.Numero1 < this.Numero3)) {
            this.setMedio(this.Numero1);
        } else if (this.Numero2 > this.Numero1 && this.Numero2 < this.Numero3) {
            this.setMedio(this.Numero2);
        } else if (this.Numero3 > this.Numero1 && this.Numero3 < this.Numero2) {
            this.setMedio(this.Numero3);
        } else {
            JOptionPane.showMessageDialog(null, "los numeros deben ser diferentes.");
        }
    }
}
