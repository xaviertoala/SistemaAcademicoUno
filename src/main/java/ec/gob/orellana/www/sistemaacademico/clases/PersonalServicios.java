/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases;

/**
 *
 * @author SO-LAB-PC6
 */
public class PersonalServicios extends Empleado{
    private String gremio;

    public PersonalServicios(String gremio, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.gremio = gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }
    
    public String agregarPersonalServicio(){
        return "";
    }
    public boolean verificarCedula (){
        return true; 
    }

    @Override
    public String toString() {
        return "personalServivcios{" + "gremio=" + gremio + super.toString()+'}';
    }
    
    
    
}
