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

            if (nombrePersonasServicios.isEmpty()
                    || cedulaPersonasServicios.isEmpty()
                    || personalPersonasServicios.isEmpty()
                    || institucionalPersonasServicios.isEmpty()
                    || sueldoPersonasServicios.isEmpty()
                    || gremioPersonasServicios.isEmpty()) {
                notificadorPersonasServicios.notificadorPersonasServicios("Erro: No se pudo agregar el Profesor. Datos vacios..");
                return;

            }
            PersonalServicios xservicios = new PersonalServicios(gremioPersonasServicios,
                    sueldoPersonasServicios,
                    nombrePersonasServicios,
                    nombrePersonasServicios,
                    0,
                    nombrePersonasServicios,
                    cedulaPersonasServicios);

            boolean respuesta = iPersonasServicios.agregarPersonalServicio(xservicios);
            if (true) {
                iPersonasServicios.imprimirDatos();
                notificadorPersonasServicios.notificadorPersonasServicios("Persona Servicio Agregado");
            }
        } catch (Exception e) {
            notificadorPersonasServicios.notificadorPersonasServicios("Error inesperado: " + e.getMessage());
        }
    }
}
