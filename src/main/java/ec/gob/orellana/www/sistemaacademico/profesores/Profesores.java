
package ec.gob.orellana.www.sistemaacademico.profesores;

public class Profesores implements IProfesores {
    
    private Profesor [] profesores;
    int totalProfesores;

    public Profesores(int dimension) {
        profesores = new Profesor[dimension];
        totalProfesores = 0;
    }
    
     public boolean agregarProfesor (Profesor profesoress){
         if(totalProfesores == profesores.length){
             return false;     
        }else{
            profesores[totalProfesores] = profesoress;
            totalProfesores += +1 ;
            return true;    
        }        
    }
    public void imprimirDatos (){
        for(int i =0; i < totalProfesores;i++)
        System.out.println("Datos del profesor :" + profesores[i].getEscalafon());
        
    }
}
