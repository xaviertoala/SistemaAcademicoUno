package ec.gob.orellana.www.sistemaacademico.estudiantes;

public class Estudiantes implements IEstudiantes {

    private Estudiante[] estudiantes;
    private int totalEstudiantes;

    public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        totalEstudiantes = 0;
    }

    @Override
    public boolean agregarEstudiantes(Estudiante estudiante) {
        if (totalEstudiantes == estudiantes.length) {
            return false;
        } else {
            estudiantes[totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes + 1;
            return true;
        }
    }

    @Override
    public void imprimirDatosE() {
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println("------Estudiante------" + "|" + (i + 1) + "|");
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Codigo: " + estudiantes[i].getCodigo());
            System.out.println("Correo Institucional: " + estudiantes[i].getCorreoInstitucional());
            System.out.println("Cedula: " + estudiantes[i].getCedula());
            System.out.println("CorreoPersonal: " + estudiantes[i].getCorreo());
            System.out.println(" ");

        }
    }

    @Override
    public boolean eliminarEstudiante(String codigo) {
        for (int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                for (int j = i; i < totalEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[totalEstudiantes - 1] = null;
                totalEstudiantes--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarEstudiante(int i, Estudiante estudiante) {
        estudiantes[i] = estudiante;
        return true;
    }

}
