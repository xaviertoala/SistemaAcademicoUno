
package ec.gob.orellana.www.sistemaacademico.controladorEstudiante;

import ec.gob.orellana.www.sistemaacademico.vistaEstudiante.NotificadorMSM;
import ec.gob.orellana.www.sistemaacademico.vistaEstudiante.VEstudiantes;

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
            notificadorMSM.notificadorMSM("Estudiante Agregado!");
            System.out.println("Nombre: "+ nombreEstudiante);
            
        } catch (Exception e) {
            notificadorMSM.notificadorMSM("ERROR");
            
        }
    }

   
    
}
