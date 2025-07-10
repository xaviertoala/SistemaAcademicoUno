/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controladorProfesor;

import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.IProfesores;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesores;
import ec.gob.orellana.www.sistemaacademico.vistaProfesor.NotificadorProfe;
import ec.gob.orellana.www.sistemaacademico.vistaProfesor.VProfesores;

/**
 *
 * @author User
 */
public class ControladorProfesores {

    private VProfesores vistaProfesor;
    private IProfesores iProfesores = new Profesores(10);
    private NotificadorProfe notificadorProfe;
    private Escalafon escalafon;

    public ControladorProfesores(VProfesores vistaProfesor) {

        this.vistaProfesor = vistaProfesor;
        this.notificadorProfe = new NotificadorProfe();
        this.escalafon = escalafon;

    }

    private Escalafon identificarEscalafon(String escalafon) {
        Escalafon tp = Escalafon.AGREGAR;
        if ("Principal".equals(escalafon)) {
            tp = Escalafon.PRINCIPAL;
        } else if ("Agregado".equals(escalafon)) {
            tp = Escalafon.AGREGAR;
        } else if ("Auxiliar".equals(escalafon)) {
            tp = Escalafon.AUXILIAR;
        }
        return tp;
    }

    public void procesoControladorProfesores() {

        try {
            String nombreProfesor = vistaProfesor.getNombre();
            int idProfesor = Integer.parseInt(vistaProfesor.getId());
            String cedulaProfesor = vistaProfesor.getCedula();
            String institucionalProfesor = vistaProfesor.getInstitucional();
            String personalProfesor = vistaProfesor.getPersonal();
            String escalafonProfesor = vistaProfesor.getEscalafon();
            Escalafon tpEscalafon = identificarEscalafon(escalafonProfesor);
            String sueldoProfesor = vistaProfesor.getSueldo();

            if (nombreProfesor.isEmpty()
                    || cedulaProfesor.isEmpty()
                    || institucionalProfesor.isEmpty()
                    || personalProfesor.isEmpty()
                    || sueldoProfesor.isEmpty()) {
                notificadorProfe.notificadorProfe("Erro: No se pudo agregar el Profesor. Datos vacios..");
                return;
            }
            Profesor xprofesor = new Profesor(tpEscalafon,
                    sueldoProfesor,
                    institucionalProfesor,
                    nombreProfesor,
                    idProfesor,
                    nombreProfesor,
                    cedulaProfesor);

            boolean respuesta = iProfesores.agregarProfesor(xprofesor);
            if (true) {
                iProfesores.imprimirDatos();
                notificadorProfe.notificadorProfe("Profesor Agregado!");
            } else {
                notificadorProfe.notificadorProfe("Error: Profesor sin datos");
            }
        } catch (Exception e) {
            notificadorProfe.notificadorProfe("Error: Profesor sin datos");
        }
    }

    public void procesoBuscarProfesor() {
        try {
            int idProfesor = Integer.parseInt(vistaProfesor.getBuscar());
            Profesor profesorBuscado = iProfesores.buscarProfesor(idProfesor);
            if (profesorBuscado != null) {
                notificadorProfe.notificadorProfe("Profesor encontrado con exito.");
            } else {
                notificadorProfe.notificadorProfe("Profesor no encontrado.");
            }
        } catch (Exception e) {
            notificadorProfe.notificadorProfe("Profesor no encontrado");
        }
    }

    public void procesoControladorEliminarProfesor() {
        try {
            int idProfesor = Integer.parseInt(vistaProfesor.getBuscar());
            Profesor profesorBuscado = iProfesores.buscarProfesor(idProfesor);
            if (profesorBuscado != null) {
                iProfesores.eliminarProfesor(idProfesor);
                notificadorProfe.notificadorProfe("Profesor dado de Baja.");
                iProfesores.imprimirDatos();
            } else {
                notificadorProfe.notificadorProfe("Profesor no encontrado");
            }
        } catch (Exception e) {
            notificadorProfe.notificadorProfe("Profesor no encontrado");
        }
    }

    public void procesoControladorActualizarProfesor() {
        try {
            int idProfesor = Integer.parseInt(vistaProfesor.getBuscar());
            Profesor actualizarPI = iProfesores.buscarProfesor(idProfesor);
            if (actualizarPI != null) {
                String nombreProfesor = vistaProfesor.getNombre();
                String cedulaProfesor = vistaProfesor.getCedula();
                String institucionalProfesor = vistaProfesor.getInstitucional();
                String personalProfesor = vistaProfesor.getPersonal();
                String sueldoProfesor = vistaProfesor.getSueldo();
                String escalafonProfesor = vistaProfesor.getEscalafon();
                Escalafon tpEscalafon = identificarEscalafon(escalafonProfesor);
                int iDProfesor = Integer.parseInt(vistaProfesor.getId());
                Profesor profesorActualizado = new Profesor(tpEscalafon, 
                        sueldoProfesor, 
                        institucionalProfesor, 
                        nombreProfesor, 
                        iDProfesor, 
                        personalProfesor, 
                        cedulaProfesor);
                iProfesores.actualizarProfesor(iDProfesor, profesorActualizado);
                notificadorProfe.notificadorProfe("Profesor actualizado");
                //iProfesores.imprimirDatos();
            } else {
                notificadorProfe.notificadorProfe("No se encontro al profesor");
            }
        } catch (Exception e) {
            notificadorProfe.notificadorProfe("Error al actualizar Profesor");
        }
    }

}
