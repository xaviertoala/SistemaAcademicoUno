/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases;


public class Estudiante extends PersonaInstitucional{
    //Atributos
    private int codigo;

    public Estudiante(int codigo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.codigo = codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String agregarEstudiante(){
        return "";
    }
    
    public boolean verificarCedula (){
        return true; 
    }
    
    @Override
    public String toString() {
        return "estudiante{" + "codigo=" + codigo + super.toString()+ '}';
    }
    

    
    
}
