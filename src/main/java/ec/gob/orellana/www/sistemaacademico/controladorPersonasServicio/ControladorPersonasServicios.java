/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controladorPersonasServicio;

import ec.gob.orellana.www.sistemaacademico.personasservicios.IPersonasServicios;
import ec.gob.orellana.www.sistemaacademico.personasservicios.PersonalServicios;
import ec.gob.orellana.www.sistemaacademico.personasservicios.PersonasServicios;
import ec.gob.orellana.www.sistemaacademico.vistaPersonasServicio.NotificadorPersonasServicios;
import ec.gob.orellana.www.sistemaacademico.vistaPersonasServicio.VPersonasServicios;

/**
 *
 * @author User
 */
public class ControladorPersonasServicios {

    private VPersonasServicios vistaPersonasServicios;
    private IPersonasServicios iPersonasServicios = new PersonasServicios(10);
    private NotificadorPersonasServicios notificadorPersonasServicios;

    public ControladorPersonasServicios(VPersonasServicios vistaPersonasServicios) {

        this.vistaPersonasServicios = vistaPersonasServicios;
        this.notificadorPersonasServicios = new NotificadorPersonasServicios();
    }

    public void procesoControladorPersonasServicios() {
        try {
            String nombrePersonasServicios = vistaPersonasServicios.getNombre();
            String cedulaPersonasServicios = vistaPersonasServicios.getCedula();
            String personalPersonasServicios = vistaPersonasServicios.getPersonal();
            String institucionalPersonasServicios = vistaPersonasServicios.getInstitucional();
            String sueldoPersonasServicios = vistaPersonasServicios.getSueldo();
            String gremioPersonasServicios = vistaPersonasServicios.getGremio();
            int idPersonasServicios = Integer.parseInt(vistaPersonasServicios.getID());

            if (nombrePersonasServicios.isEmpty()
                    || cedulaPersonasServicios.isEmpty()
                    || personalPersonasServicios.isEmpty()
                    || institucionalPersonasServicios.isEmpty()
                    || sueldoPersonasServicios.isEmpty()
                    || gremioPersonasServicios.isEmpty()) {
                notificadorPersonasServicios.notificadorPersonasServicios("Erro: No se pudo agregar el Personal Servicio. Datos vacios..");
                return;

            }
            PersonalServicios xservicios = new PersonalServicios(gremioPersonasServicios,
                    sueldoPersonasServicios,
                    nombrePersonasServicios,
                    nombrePersonasServicios,
                    idPersonasServicios,
                    nombrePersonasServicios,
                    cedulaPersonasServicios);

            boolean respuesta = iPersonasServicios.agregarPersonalServicio(xservicios);
            if (true) {
                iPersonasServicios.imprimirDatos();
                notificadorPersonasServicios.notificadorPersonasServicios("Persona Servicio Agregado");
            }
        } catch (Exception e) {
            notificadorPersonasServicios.notificadorPersonasServicios("Error Persona de servicio sin datos. ");
        }
    }

    public void procesoBuscarPS() {
        try {
            int idPersonasServicios = Integer.parseInt(vistaPersonasServicios.getBuscar());
            PersonalServicios personaServicioBuscada = iPersonasServicios.buscarPersonalServicio(idPersonasServicios);
            if (personaServicioBuscada != null) {
                notificadorPersonasServicios.notificadorPersonasServicios("Persona de servicios encontrada con exito.");
            } else {
                notificadorPersonasServicios.notificadorPersonasServicios("Persona de servicios no encontrada.  ");
            }
        } catch (Exception e) {
            notificadorPersonasServicios.notificadorPersonasServicios("Persona de servicios no encontrada. ");
        }
    }

    public void procesoEliminarPS() {
        try {
            int idPersonasServicios = Integer.parseInt(vistaPersonasServicios.getBuscar());
            PersonalServicios personaServicioBuscada = iPersonasServicios.buscarPersonalServicio(idPersonasServicios);
            if (personaServicioBuscada != null) {
                iPersonasServicios.eliminarPersonalServicio(idPersonasServicios);
                notificadorPersonasServicios.notificadorPersonasServicios("Persona de servicios dado de baja.");
                iPersonasServicios.imprimirDatos();
            } else {
                notificadorPersonasServicios.notificadorPersonasServicios("Persona de servicios no encontrada.");
            }
        } catch (Exception e) {
            notificadorPersonasServicios.notificadorPersonasServicios("Persona de servicios no encontrada.");
        }
    }

    public void procesoActualizarPS() {
        try {
            int idPersonasServicios = Integer.parseInt(vistaPersonasServicios.getBuscar());
            PersonalServicios actualizarPS = iPersonasServicios.buscarPersonalServicio(idPersonasServicios);
            if (actualizarPS != null) {
                String nombrePersonasServicios = vistaPersonasServicios.getNombre();
                String cedulaPersonasServicios = vistaPersonasServicios.getCedula();
                String personalPersonasServicios = vistaPersonasServicios.getPersonal();
                String institucionalPersonasServicios = vistaPersonasServicios.getInstitucional();
                String sueldoPersonasServicios = vistaPersonasServicios.getSueldo();
                String gremioPersonasServicios = vistaPersonasServicios.getGremio();
                int idPersonaServicio = Integer.parseInt(vistaPersonasServicios.getID());
                
                PersonalServicios personalSActualizado = new PersonalServicios(gremioPersonasServicios,
                        sueldoPersonasServicios,
                        institucionalPersonasServicios,
                        nombrePersonasServicios,
                        idPersonaServicio,
                        personalPersonasServicios,
                        cedulaPersonasServicios);
                iPersonasServicios.actualizarPersonalServicio(idPersonaServicio, personalSActualizado);
                notificadorPersonasServicios.notificadorPersonasServicios("Personal de servicio Actualizado.");
                //iPersonasServicios.imprimirDatos();
            } else {
                notificadorPersonasServicios.notificadorPersonasServicios("No se encontro persona de servicio. ");
            }
        } catch (Exception e) {
            notificadorPersonasServicios.notificadorPersonasServicios("Error al actualizar personal de servicio. ");
        }
    }

}
