package ec.gob.orellana.www.sistemaacademico.controladorEstudiante;

import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiante;
import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiantes;
import ec.gob.orellana.www.sistemaacademico.estudiantes.IEstudiantes;
import ec.gob.orellana.www.sistemaacademico.vistaEstudiante.NotificadorMSM;
import ec.gob.orellana.www.sistemaacademico.vistaEstudiante.VEstudiantes;

public class ControladorEstudiantes {

    private VEstudiantes vistaEstudiantes;
    private NotificadorMSM notificadorMSM;
    private IEstudiantes iEstudiantes = new Estudiantes(10);

    public ControladorEstudiantes(VEstudiantes vistaEstudiantes) {
        this.vistaEstudiantes = vistaEstudiantes;
        this.notificadorMSM = new NotificadorMSM();

    }

    public void procesoControladorEstudiantes() {
        try {
            String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigoEstudiante());
            String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucionalEstudiante();
            String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonalEstudiante();
            String cedulaEstudiante = vistaEstudiantes.getCedula();
            if (nombreEstudiante.isEmpty()
                    //|| codigoEstudiante.isEmpty()
                    || correoInstitucionalEstudiante.isEmpty()
                    || correoPersonalEstudiante.isEmpty()
                    || cedulaEstudiante.isEmpty()) {
                notificadorMSM.notificadorMSM("Error: No se pudo agregar el estudiante. Datos vacios.");
                return;
            }
            Estudiante xestudiante = new Estudiante(codigoEstudiante,
                    correoInstitucionalEstudiante,
                    nombreEstudiante,
                    0,
                    correoPersonalEstudiante,
                    cedulaEstudiante);
            boolean respuestas = iEstudiantes.agregarEstudiantes(xestudiante);
            if (true) {
                iEstudiantes.imprimirDatosE();
                notificadorMSM.notificadorMSM("Estudiante Agregado!");
            } else {
                notificadorMSM.notificadorMSM("No agregaste nd!");
            }

        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Error inesperado:  " + e.getMessage());

        }
    }

    public void procesoBuscarEstudiante() {
        try {
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getBuscarEstudianteCodigo());
            boolean estudianteBuscado = iEstudiantes.buscarEstudiante(codigoEstudiante);
            if (estudianteBuscado == true) {
                notificadorMSM.notificadorMSM("Estudiante buscado");
            } else {
                notificadorMSM.notificadorMSM("Estudiante no encontrado");
            }
        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Estudiante no encontrado");
        }

    }

    public void procesoEliminarE() {
        try {
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getBuscarEstudianteCodigo());
            boolean estudianteBuscado = iEstudiantes.buscarEstudiante(codigoEstudiante);
            if (estudianteBuscado) {
                iEstudiantes.eliminarEstudiante(codigoEstudiante);
                notificadorMSM.notificadorMSM("Estudiante dado de baja");
                iEstudiantes.imprimirDatosE();
            }

        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Estudiante no encontrado");
        }
    }

    public void procesoActualizarE() {
        try {
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getBuscarEstudianteCodigo());
            boolean actualizar = iEstudiantes.buscarEstudiante(codigoEstudiante);
            if (actualizar) {
                String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
                //int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigoEstudiante());
                String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucionalEstudiante();
                String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonalEstudiante();
                String cedulaEstudiante = vistaEstudiantes.getCedula();

                Estudiante estudianteActualizado = new Estudiante(codigoEstudiante,
                        correoInstitucionalEstudiante,
                        nombreEstudiante,
                        codigoEstudiante,
                        nombreEstudiante,
                        cedulaEstudiante);
                iEstudiantes.actualizarEstudiante(codigoEstudiante, estudianteActualizado);
                notificadorMSM.notificadorMSM("Estudiante Actualizado.");
                iEstudiantes.imprimirDatosE();

            } else {
                notificadorMSM.notificadorMSM("No se encontro estudiante con codigo: " + codigoEstudiante);
            }

        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Error al actualizar Estudiante. ");
        }

    }
}
