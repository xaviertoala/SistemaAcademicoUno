package ec.gob.orellana.www.sistemaacademico.estudiantes;

public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);
    public void imprimirDatosE ();
    public boolean eliminarEstudiante (int i, Estudiante estudiante);
    public boolean actualizarEstudiante (int i, Estudiante estudiante);
}
