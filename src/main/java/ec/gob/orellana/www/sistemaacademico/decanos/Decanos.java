/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.decanos;

/**
 *
 * @author SO-LAB-PC6
 */
public class Decanos implements IDecanos {
    public String AgregarDecano(){
        return "";
    }
    public void imprimirDatos (Decano [] decano){
        for (int i =0; i < decano.length; i++){
        System.out.println("Datos decano: "+ decano[i].toString());
        }
    }
    
 
}
