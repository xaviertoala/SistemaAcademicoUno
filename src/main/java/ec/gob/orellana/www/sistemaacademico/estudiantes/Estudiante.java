
package ec.gob.orellana.www.sistemaacademico.estudiantes;

import ec.gob.orellana.www.sistemaacademico.clases.PersonaInstitucional;


public class Estudiante extends PersonaInstitucional{
    //Atributos
    private String codigo;

    public Estudiante(String codigo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + super.toString() + '}';
    }

    
    
}
