/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

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
        persona objPersona = new persona();
        objPersona.crearPersona("Eduardo", "01-02-2000", 20);
        System.out.println("Persona creada");
        System.out.println("Nombre:  " + objPersona.getNombre());
        System.out.println("Fecha de Nacimiento:  " + objPersona.getFechaNacimiento());
        System.out.println("Edad: " + objPersona.getEdad());
     }
    
}
