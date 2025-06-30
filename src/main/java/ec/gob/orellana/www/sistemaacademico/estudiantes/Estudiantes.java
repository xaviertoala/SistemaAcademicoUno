package ec.gob.orellana.www.sistemaacademico.estudiantes;

public class Estudiantes implements IEstudiantes {

    private Estudiante [] estudiantes; 
    private int totalEstudiantes; 
    
   public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension];
        totalEstudiantes =0;
    }
    
    
    @Override
    public boolean agregarEstudiantes (Estudiante estudiante){
        if (totalEstudiantes == estudiantes.length){
            return false;
        } else {
            estudiantes [totalEstudiantes] = estudiante;
            totalEstudiantes = totalEstudiantes +1;
            return true;
        }     
    }
    @Override
    public void imprimirDato (){
        for (int i =0; i< totalEstudiantes; i++){
            System.out.println("------Estudiante------"+"|"+(i+1)+"|");
            System.out.println("Datos del Estudiante: "+ estudiantes[i].getCodigo());
        }
    }
        
    @Override
    public boolean eliminarEstudiante (int i, Estudiante estudiante){
        estudiantes [i]= estudiante; 
        return true; 
    }
    
    @Override
    public boolean actualizarEstudiante (int i, Estudiante estudiante){
        estudiantes [i] = estudiante;     
        return true; 
    }

    

}
