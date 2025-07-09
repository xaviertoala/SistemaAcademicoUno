package ec.gob.orellana.www.sistemaacademico.estudiantes;

public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);
    public void imprimirDatosE ();
    public boolean eliminarEstudiante (String codigo);
    public boolean actualizarEstudiante (int i, Estudiante estudiante);
}
