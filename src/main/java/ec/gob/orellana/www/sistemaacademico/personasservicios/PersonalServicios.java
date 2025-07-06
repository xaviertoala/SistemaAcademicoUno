
package ec.gob.orellana.www.sistemaacademico.personasservicios;

import ec.gob.orellana.www.sistemaacademico.clases.Empleado;


public class PersonalServicios extends Empleado{
    
    private String gremio;

    public PersonalServicios(String gremio, String sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.gremio = gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }
    

    @Override
    public String toString() {
        return "personalServivcios{" + "gremio=" + gremio + super.toString()+'}';
    }
    
    
    
}
