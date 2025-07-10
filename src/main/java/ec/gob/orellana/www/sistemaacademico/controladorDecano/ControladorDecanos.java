package ec.gob.orellana.www.sistemaacademico.controladorDecano;

import ec.gob.orellana.www.sistemaacademico.decanos.Decano;
import ec.gob.orellana.www.sistemaacademico.decanos.Decanos;
import ec.gob.orellana.www.sistemaacademico.decanos.IDecanos;
import ec.gob.orellana.www.sistemaacademico.vistaDecano.NotificadorDecano;
import ec.gob.orellana.www.sistemaacademico.vistaDecano.VDecanos;

public class ControladorDecanos {

    private VDecanos vistaDecanos;
    private NotificadorDecano notificadorDecano;
    private IDecanos iDecanos = new Decanos(10);

    public ControladorDecanos(VDecanos vistaDecanos) {
        this.vistaDecanos = vistaDecanos;
        this.notificadorDecano = new NotificadorDecano();

    }

    public void procesoControladorDecanos() {
        try {
            String nombreEstudiante = vistaDecanos.getNombre();
            String nivelJerarquico = vistaDecanos.getJerarquico();
            String cedulaDecano = vistaDecanos.getCedula();
            String correoInstitucional = vistaDecanos.getInstitucional();
            String correoPersonal = vistaDecanos.getPersonal();
            String sueldoDecano = vistaDecanos.getSueldo();
            int idDecano = Integer.parseInt(vistaDecanos.getId());

            if (nombreEstudiante.isEmpty()
                    || nivelJerarquico.isEmpty()
                    || cedulaDecano.isEmpty()
                    || correoInstitucional.isEmpty()
                    || correoPersonal.isEmpty()
                    || sueldoDecano.isEmpty()) {
                notificadorDecano.notificadorDecano("Error: No se pudo agregar al Decano. Datos vacios.");
                return;
            }
            Decano xDecano = new Decano(nivelJerarquico,
                    sueldoDecano,
                    correoInstitucional,
                    nombreEstudiante,
                    idDecano,
                    correoPersonal,
                    cedulaDecano);
            boolean respuesta = iDecanos.AgregarDecanos(xDecano);
            if (true) {
                iDecanos.imprimirDatos();;
                notificadorDecano.notificadorDecano("Decano agregado!");
            }
        } catch (Exception e) {
            notificadorDecano.notificadorDecano("Error inesperado:  " + e.getMessage());
        }
    }


    public void procesoBuscarD() {
        try {
            int idDecano = Integer.parseInt(vistaDecanos.getBuscar());
            Decano decanoBuscado = iDecanos.buscarDecano(idDecano);
            if (decanoBuscado != null) {
                notificadorDecano.notificadorDecano("Decano encontrado.");
            } else {
                notificadorDecano.notificadorDecano("Decano no encontrado");
            }
        } catch (Exception e) {
            notificadorDecano.notificadorDecano("Decano no encontrado");
        }
    }

    public void procesoEliminarD() {
        try {
            int idDecano = Integer.parseInt(vistaDecanos.getBuscar());
            Decano decanoBuscado = iDecanos.buscarDecano(idDecano);
            if (decanoBuscado != null) {
                iDecanos.eliminarDecano(idDecano);
                notificadorDecano.notificadorDecano("Decano dado de baja.");
                iDecanos.imprimirDatos();
            } else {
                notificadorDecano.notificadorDecano("Decano no encontrado.");
            }
        } catch (Exception e) {
            notificadorDecano.notificadorDecano("Decano no encontrado.");
        }
    }

    public void procesoActualizarD() {
        try {
            int idDecano = Integer.parseInt(vistaDecanos.getBuscar());
            Decano actualizar = iDecanos.buscarDecano(idDecano);
            if (actualizar != null) {
                String nombreEstudiante = vistaDecanos.getNombre();
                String nivelJerarquico = vistaDecanos.getJerarquico();
                String cedulaDecano = vistaDecanos.getCedula();
                String correoInstitucional = vistaDecanos.getInstitucional();
                String correoPersonal = vistaDecanos.getPersonal();
                String sueldoDecano = vistaDecanos.getSueldo();
                int iDDecano = Integer.parseInt(vistaDecanos.getId());
                Decano decanoActualizado = new Decano (nivelJerarquico,
                        sueldoDecano,
                        correoInstitucional,
                        nombreEstudiante,
                        iDDecano,
                        correoPersonal,
                        cedulaDecano);
                iDecanos.actualizarDecano(iDDecano, decanoActualizado);
                notificadorDecano.notificadorDecano("Decano actualizado.");
                //iDecanos.imprimirDatos();
            } else {
                notificadorDecano.notificadorDecano("No se encontro al Decano ");
            }
        } catch (Exception e) {
            notificadorDecano.notificadorDecano("Error al actualizar decano.");
        }

    }
}
