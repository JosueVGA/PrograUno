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
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //persona objPersona = new persona("Eduardo", "2000-01-01", 20);
        Alumno objAlumno = new Alumno("Luis Ejemplo", "2000-01-01", 20);
        objAlumno.setMatricula("45121245");
        objAlumno.mostrarDatos();
        Profesor objProfesor=new Profesor("Carlos Perez","1980-01-01", 40);
        objProfesor.setDpi("7777777");
        objProfesor.mostrarDatos();
        
      //  JOptionPane.showMessageDialog(null, objPersona.getNombre()+" "+ objPersona.getFechaNacimiento()+" "+ objPersona.getEdad());
        // persona objPersona2 = new persona("Juan Pueblo", "2002-01-01", 18);
        //JOptionPane.showMessageDialog(null, objPersona2.getNombre()+" "+ objPersona2.getFechaNacimiento()+" "+ objPersona2.getEdad());
        //JOptionPane.showMessageDialog(null,objPersona.sumaNumeros(15, 15));
        //JOptionPane.showMessageDialog(null,objPersona.sumaNumeros(15.25, 15.25));
        
     }
    
}
