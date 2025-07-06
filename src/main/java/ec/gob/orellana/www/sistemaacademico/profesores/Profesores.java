
package ec.gob.orellana.www.sistemaacademico.profesores;

public class Profesores implements IProfesores {
    
    private Profesor [] profesores;
    int totalProfesores;

    public Profesores(int dimension) {
        profesores = new Profesor[dimension];
        totalProfesores = 0;
    }
    
    @Override
     public boolean agregarProfesor (Profesor profesoress){
         if(totalProfesores == profesores.length){
             return false;     
        }else{
            profesores[totalProfesores] = profesoress;
            totalProfesores += +1 ;
            return true;    
        }        
    }
    @Override
    public void imprimirDatos (){
        for(int i =0; i < totalProfesores;i++){
            System.out.println("------Profesor------"+"|"+(i+1)+"|");
            System.out.println("Escalafon: "+profesores[i].getEscalafon());
            System.out.println("Nombre: "+ profesores[i].getNombre());
            System.out.println("Cedula: "+ profesores[i].getCedula());
            System.out.println("Correo Institucional: "+ profesores[i].getCorreoInstitucional());
            System.out.println("Correo Personal: "+ profesores[i].getCorreo());
            System.out.println("Sueldo: "+ profesores[i].getSueldo());
            System.out.println(" ");
        
        }
    }
}
