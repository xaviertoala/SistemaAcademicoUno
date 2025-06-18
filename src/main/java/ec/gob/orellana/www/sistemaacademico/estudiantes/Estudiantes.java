package ec.gob.orellana.www.sistemaacademico.estudiantes;

public class Estudiantes implements IEstudiantes {

    public String agregarEstudiante() {
        return "";
    }

    public void imprimirDato (Estudiante [] estudiante){
        for (int i =0; i< estudiante.length; i++){
            System.out.println("Datos del Estudiante: "+ estudiante [i].toString());
        }
    }

}
