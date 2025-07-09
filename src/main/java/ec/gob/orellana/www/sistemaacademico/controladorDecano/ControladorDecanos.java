
package ec.gob.orellana.www.sistemaacademico.controladorDecano;

import ec.gob.orellana.www.sistemaacademico.decanos.Decano;
import ec.gob.orellana.www.sistemaacademico.decanos.Decanos;
import ec.gob.orellana.www.sistemaacademico.decanos.IDecanos;
import ec.gob.orellana.www.sistemaacademico.vistaDecano.NotificadorDecano;
import ec.gob.orellana.www.sistemaacademico.vistaDecano.VDecanos;


public class ControladorDecanos {
    private VDecanos vistaDecanos; 
    private NotificadorDecano notificadorDecano;
    private IDecanos iDecanos = new Decanos (10);
    
    public ControladorDecanos(VDecanos vistaDecanos) {
        this.vistaDecanos = vistaDecanos;
        this.notificadorDecano = new NotificadorDecano (); 
        
    }
    
    public void procesoControladorDecanos (){
        try {
            String nombreEstudiante = vistaDecanos.getNombre();
            String nivelJerarquico = vistaDecanos.getJerarquico();
            String cedulaDecano = vistaDecanos.getCedula();
            String correoInstitucional = vistaDecanos.getInstitucional();
            String correoPersonal = vistaDecanos.getPersonal();
            String sueldoDecano = vistaDecanos.getSueldo();
            
            if (nombreEstudiante.isEmpty()
                    || nivelJerarquico.isEmpty()
                    || cedulaDecano.isEmpty()
                    || correoInstitucional.isEmpty()
                    || correoPersonal.isEmpty()
                    || sueldoDecano.isEmpty()){
                notificadorDecano.notificadorDecano("Error: No se pudo agregar al Decano. Datos vacios.");
                return; 
            }
            Decano xDecano = new Decano (nivelJerarquico, 
                    sueldoDecano, 
                    correoInstitucional, 
                    nombreEstudiante, 
                    0, 
                    correoPersonal, 
                    cedulaDecano);
            boolean respuesta = iDecanos.AgregarDecanos(xDecano);
            if (true){
                iDecanos.imprimirDatos();;
                notificadorDecano.notificadorDecano("Decano agregado!");
            }
        } catch (Exception e) {
            notificadorDecano.notificadorDecano("Error inesperado:  " + e.getMessage());
        }
    }
    
    
    
}
