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
                notificadorMSM.notificadorMSM("Error: Estudiante sin datos");
            }
        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Error: Estudiante sin datos");
        }
    }

    public void procesoBuscarEstudiante() {
        try {
            int codigoEstudianteBuscado = Integer.parseInt(vistaEstudiantes.getBuscarEstudianteCodigo());
            Estudiante estudianteBuscado = iEstudiantes.buscarEstudiante(codigoEstudianteBuscado);
            if (estudianteBuscado != null) {
                notificadorMSM.notificadorMSM("Estudiante encontrado con exito.");
            } else {
                notificadorMSM.notificadorMSM("Estudiante no encontrado.");
            }
        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Estudiante no encontrado");
        }

    }

    public void procesoEliminarE() {
        try {
            int codigoEstudianteBuscado = Integer.parseInt(vistaEstudiantes.getBuscarEstudianteCodigo());
            Estudiante estudianteBuscado = iEstudiantes.buscarEstudiante(codigoEstudianteBuscado);
            if (estudianteBuscado != null) {
                iEstudiantes.eliminarEstudiante(codigoEstudianteBuscado);
                notificadorMSM.notificadorMSM("Estudiante dado de baja");
                iEstudiantes.imprimirDatosE();
            } else {
                notificadorMSM.notificadorMSM("Estudiante no encontrado");
            }
        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Estudiante no encontrado");
        }
    }

    public void procesoActualizarE() {
        try {
            //int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigoEstudiante());
            int codigoEstudianteBuscado = Integer.parseInt(vistaEstudiantes.getBuscarEstudianteCodigo());
            Estudiante actualizar = iEstudiantes.buscarEstudiante(codigoEstudianteBuscado);
            if (actualizar != null) {
                String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
                int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigoEstudiante());
                String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucionalEstudiante();
                String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonalEstudiante();
                String cedulaEstudiante = vistaEstudiantes.getCedula();

                Estudiante estudianteActualizado = new Estudiante(codigoEstudiante,
                        correoInstitucionalEstudiante,
                        nombreEstudiante,
                        0,
                        nombreEstudiante,
                        cedulaEstudiante);
                iEstudiantes.actualizarEstudiante(codigoEstudiante, estudianteActualizado);
                notificadorMSM.notificadorMSM("Estudiante Actualizado.");
                //iEstudiantes.imprimirDatosE();
            } else {
                notificadorMSM.notificadorMSM("No se encontro al estudiante");
            }

        } catch (Exception e) {
            notificadorMSM.notificadorMSM("Error al actualizar Estudiante. ");
        }

    }
}
