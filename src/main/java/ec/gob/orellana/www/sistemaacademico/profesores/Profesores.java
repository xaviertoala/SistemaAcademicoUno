/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.profesores;


public class Profesores implements IProfesores {
     public String agregarProfesor (){
         return "";
     }
    public void imprimirDatos (Profesor [] profesor){
        for(int i =0; i < profesor.length;i++)
        System.out.println("Datos del profesor :" + profesor[i].toString());
    }
}
