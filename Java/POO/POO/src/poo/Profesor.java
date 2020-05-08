/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTE
 */
public class Profesor extends persona {

    private String dpi;

    public Profesor(String nombre, String fechaNacimiento, int edad) {
        super(nombre, fechaNacimiento, edad);
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "PROFESOR \n Nombre: " + getNombre() + " Fecha Nacimiento: " + getFechaNacimiento()+ " Edad: " + getEdad() + " Dpi: " + getDpi());
    }
}
