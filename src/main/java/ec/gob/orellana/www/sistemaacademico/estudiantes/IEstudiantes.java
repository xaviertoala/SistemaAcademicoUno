package ec.gob.orellana.www.sistemaacademico.estudiantes;

public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);
    public void imprimirDatosE ();
    public boolean buscarEstudiante (int codigo);
    public boolean eliminarEstudiante (int codigo);
    public boolean actualizarEstudiante (int codigo, Estudiante estudiante);
}
