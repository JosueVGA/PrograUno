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
public class Alumno extends persona {
    private String matricula;    
    public Alumno(String nombre, String fechaNacimiento, int edad) {
        super(nombre, fechaNacimiento, edad);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   public void mostrarDatos() {
       JOptionPane.showMessageDialog(null,"ALUMNO \n Nombre: " +  getNombre() + " Fecha Nacimiento: " + getFechaNacimiento()+"Matricula: "+ getMatricula());
   } 
  
}
