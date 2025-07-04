
package ec.gob.orellana.www.sistemaacademico.controlador;

import ec.gob.orellana.www.sistemaacademico.vista.NotificadorMSM;
import ec.gob.orellana.www.sistemaacademico.vista.VEstudiantes;

public class ControladorEstudiantes {
    
    private VEstudiantes vistaEstudiantes; 
    private NotificadorMSM notificadorMSM;
    
    public ControladorEstudiantes (VEstudiantes vistaEstudiantes){
        this.vistaEstudiantes = vistaEstudiantes;
        this.notificadorMSM = new NotificadorMSM ();
    } 
    public void procesoControladorEstudiantes (){
        try {
            
            String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
            String codigoEstudiante = vistaEstudiantes.getCodigoEstudiante();
            String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucionalEstudiante();
            String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonalEstudiante();
            String cedulaEstudiante = vistaEstudiantes.getCedula();
            notificadorMSM.notificadorMSM("Vas bien crack!");
            
        } catch (Exception e) {
            notificadorMSM.notificadorMSM("ERROR");
            
        }
    }

   
    
}
