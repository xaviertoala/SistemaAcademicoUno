/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases;


public  class Empleado extends PersonaInstitucional{
    
    //Atributos
    private double sueldo;

    //Constructor
    public Empleado(double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.sueldo = sueldo;
    }
    
    // public abstract boolean verificarCedula ();
    @Override
    public String toString() {
        return "empleado{" + "sueldo=" + sueldo + super.toString()+ '}';
    }
    
    
    
}
