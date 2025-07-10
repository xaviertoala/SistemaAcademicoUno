/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.decanos;

/**
 *
 * @author SO-LAB-PC6
 */
public interface IDecanos {
    public boolean AgregarDecanos(Decano decano);
    public void imprimirDatos ();
    public boolean actualizarDecano (int id, Decano decano);
    public boolean eliminarDecano (int id);
    public Decano buscarDecano (int id);
}
