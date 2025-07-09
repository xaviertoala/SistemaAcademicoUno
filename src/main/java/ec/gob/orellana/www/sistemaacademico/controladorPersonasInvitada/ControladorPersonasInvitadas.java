/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controladorPersonasInvitada;

import ec.gob.orellana.www.sistemaacademico.personasinvitadas.IPersonasInvitadas;
import ec.gob.orellana.www.sistemaacademico.personasinvitadas.PersonaInvitada;
import ec.gob.orellana.www.sistemaacademico.personasinvitadas.PersonasInvitadas;
import ec.gob.orellana.www.sistemaacademico.vistaPersonasInvitada.NotificadorPersonasInvitadas;
import ec.gob.orellana.www.sistemaacademico.vistaPersonasInvitada.VPersonasInvitadas;

/**
 *
 * @author User
 */
public class ControladorPersonasInvitadas {
    
    private VPersonasInvitadas vistaPersonasInvitadas;
    private IPersonasInvitadas iPersonasInvitadas = new PersonasInvitadas(10);
    private NotificadorPersonasInvitadas notificadorPersonasInvitadas;

    public ControladorPersonasInvitadas(VPersonasInvitadas vistaPersonasInvitadas){
       
       this.vistaPersonasInvitadas =  vistaPersonasInvitadas;
       this.notificadorPersonasInvitadas = new NotificadorPersonasInvitadas();
    }
    
    public void procesoControladorPersonasInvitadas(){

        try {
            String nombrePersonasInvitadas = vistaPersonasInvitadas.getNombre();
            String cedulaPersonasInvitadas = vistaPersonasInvitadas.getCedula();
            String personalPersonasInvitadas = vistaPersonasInvitadas.getPersonal();
            String descripcionPersonasInvitadas = vistaPersonasInvitadas.getDescripcion(); 
            int idPersonasInvitadas = Integer.parseInt(vistaPersonasInvitadas.getId());
            
            if(nombrePersonasInvitadas.isEmpty()
                    ||cedulaPersonasInvitadas.isEmpty()
                    ||personalPersonasInvitadas.isEmpty()
                    ||descripcionPersonasInvitadas.isEmpty()){
                notificadorPersonasInvitadas.notificadorPersonasInvitadas("Erro: No se pudo agregar el Profesor. Datos vacios..");
                return;
                
            }
            PersonaInvitada xinvitada = new PersonaInvitada(nombrePersonasInvitadas,
                    idPersonasInvitadas,
                    personalPersonasInvitadas,
                    cedulaPersonasInvitadas,
                    descripcionPersonasInvitadas);
            
            boolean respuesta = iPersonasInvitadas.agregarpersonaInvitada(xinvitada);
            if(true){
                iPersonasInvitadas.imprimirDatos();
                notificadorPersonasInvitadas.notificadorPersonasInvitadas("Persona Invitada Agregado");
            }
            
        } catch (Exception e) {
            notificadorPersonasInvitadas.notificadorPersonasInvitadas("Error inesperado: " + e.getMessage());
        }
}
    public void procesoBuscarPersonasInvitadas(){
        try {
            int idPersonasInvitadas = Integer.parseInt(vistaPersonasInvitadas.getBuscar());
            boolean personasInvitadasBuscado = iPersonasInvitadas.buscarPersonasInvitadas(idPersonasInvitadas);
            if (personasInvitadasBuscado == true){
                 notificadorPersonasInvitadas.notificadorPersonasInvitadas("Persona Invitada encontrado");
            } else {
                 notificadorPersonasInvitadas.notificadorPersonasInvitadas("Personas Invitadas no encontrado");
            }
           
        } catch (Exception e) {
            notificadorPersonasInvitadas.notificadorPersonasInvitadas("Personas Invitadas no encontrado");
        }
    }
    
    public void procesoControladorEliminarPersonasInvitadas(){
        try {
            int idPersonasInvitadas = Integer.parseInt(vistaPersonasInvitadas.getBuscar());
            boolean personasInvitadasBuscado = iPersonasInvitadas.buscarPersonasInvitadas(idPersonasInvitadas);
            if(personasInvitadasBuscado == true){
                iPersonasInvitadas.eliminarPersonasInvitadas(idPersonasInvitadas);
                notificadorPersonasInvitadas.notificadorPersonasInvitadas("Personas Invitadas dado de Baja.");
                iPersonasInvitadas.imprimirDatos();
            } else {
                notificadorPersonasInvitadas.notificadorPersonasInvitadas("Error en Eliminar Personas Invitadas");
            }
        } catch (Exception e) {
            notificadorPersonasInvitadas.notificadorPersonasInvitadas("Error en Eliminar Personas Invitadas");
        }
    }
    
    public void procesoControladorActualizarPersonasInvitadas(){
        try {
            int idPersonasInvitadas = Integer.parseInt(vistaPersonasInvitadas.getBuscar());
            boolean actualizarPI = iPersonasInvitadas.buscarPersonasInvitadas(idPersonasInvitadas);
            if (actualizarPI){
            String nombrePersonasInvitadas = vistaPersonasInvitadas.getNombre();
            String cedulaPersonasInvitadas = vistaPersonasInvitadas.getCedula();
            String personalPersonasInvitadas = vistaPersonasInvitadas.getPersonal();
            String descripcionPersonasInvitadas = vistaPersonasInvitadas.getDescripcion(); 
            
            PersonaInvitada personaInvitadaActualizada = new PersonaInvitada(nombrePersonasInvitadas,
                    idPersonasInvitadas,
                    personalPersonasInvitadas,
                    cedulaPersonasInvitadas,
                    descripcionPersonasInvitadas);
            
                    iPersonasInvitadas.actualizarPersonaInvitada(idPersonasInvitadas, personaInvitadaActualizada);
                    notificadorPersonasInvitadas.notificadorPersonasInvitadas("Persona Invitada actualizado");
                    iPersonasInvitadas.imprimirDatos();
            } else{
                notificadorPersonasInvitadas.notificadorPersonasInvitadas("No se encontro el ID del Persona Invitada"+idPersonasInvitadas);
            }
          
        }  catch (Exception e) {
            notificadorPersonasInvitadas.notificadorPersonasInvitadas("Error al actualizar Persona Invitada");
        }
    }
    
}

