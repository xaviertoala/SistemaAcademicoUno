/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases.personasexternas;

import ec.gob.orellana.www.sistemaacademico.clases.personas.Persona;

public class PersonaInvitada extends Persona {
    
    private String descripcion;
    //Constructor
    public PersonaInvitada(String nombre, int id, String correo, String cedula, String descripcion){
        super(nombre, id, correo, cedula);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    //Metodos
    @Override
    public String toString() {
        return "Persona Invitada {" + super.toString()+ '}';
    }
    
    public boolean verificarCedula (){
        return true;
    }
}
