/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases.personas;

public class Persona {
 private String nombre;
 private int id;
 private String correo;
 private String cedula;

 //Constructor

    public Persona(String nombre, int id, String correo, String cedula) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.cedula = cedula;
    }
 
    //Metodo
    
    //abstract boolean verificarCedula (); 

    @Override
    public String toString() {
        return "Persona {" + "nombre=" + nombre + ", id=" + id + ", correo=" + correo + ", cedula=" + cedula + '}';
    }
    

}
