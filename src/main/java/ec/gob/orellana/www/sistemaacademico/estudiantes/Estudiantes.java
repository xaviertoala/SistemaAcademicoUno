package ec.gob.orellana.www.sistemaacademico.estudiantes;

public class Estudiantes implements IEstudiantes {

    private Estudiante [] estudiantes; 
    private int totalEstudiantes; 
    
   public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        totalEstudiantes =0;
    }
    
    
    public boolean agregarEstudiantes (Estudiante estudiante){
        if (totalEstudiantes == estudiantes.length){
            return false;
        } else {
            estudiantes [totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes +1;
            return true;
        }     
    }
    public void imprimirDato (){
        for (int i =0; i< totalEstudiantes; i++){
            System.out.println("------Estudiante------"+"|"+(i+1)+"|");
            System.out.println("Datos del Estudiante: "+ estudiantes[i].toString());
        }
    }

}
