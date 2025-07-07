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
            
            if(nombrePersonasInvitadas.isEmpty()
                    ||cedulaPersonasInvitadas.isEmpty()
                    ||personalPersonasInvitadas.isEmpty()
                    ||descripcionPersonasInvitadas.isEmpty()){
                notificadorPersonasInvitadas.notificadorPersonasInvitadas("Erro: No se pudo agregar el Profesor. Datos vacios..");
                return;
                
            }
            PersonaInvitada xinvitada = new PersonaInvitada(nombrePersonasInvitadas, 
                    0, 
                    nombrePersonasInvitadas, 
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
    
}

