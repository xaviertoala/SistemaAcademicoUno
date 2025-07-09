
package ec.gob.orellana.www.sistemaacademico.personasinvitadas;

public class PersonasInvitadas implements IPersonasInvitadas {
    
    private PersonaInvitada [] personasInvitadas;
    private int totalPersonasI;

    public PersonasInvitadas(int dimension) {
        personasInvitadas = new PersonaInvitada[dimension];
        totalPersonasI=0;
    }
    
    
    public boolean agregarpersonaInvitada(PersonaInvitada personaInvitada){
        if(totalPersonasI == personasInvitadas.length){
             return false;     
        }else{
            personasInvitadas[totalPersonasI] = personaInvitada;
            totalPersonasI = totalPersonasI +1 ;
            return true;    
        }        
    }
    
    public void imprimirDatos (){
        for (int i = 0; i < totalPersonasI; i++) {
            System.out.println("------Personas Invitadas------"+"|"+(i+1)+"|");
            System.out.println("Nombre: "+ personasInvitadas[i].getNombre());
            System.out.println("Id de Profesor: "+personasInvitadas[i].getId());
            System.out.println("Cedula: "+ personasInvitadas[i].getCedula());
            System.out.println("Correo Personal: "+ personasInvitadas[i].getCorreo());
            System.out.println("Descripcion: "+ personasInvitadas[i].getDescripcion());
            System.out.println(" ");
      
        }
    }
    
    public boolean actualizarPersonaInvitada (int id, PersonaInvitada persoonaInvitada){
        for (int i = 0; i < totalPersonasI; i++) {
            personasInvitadas[i] = persoonaInvitada;
            imprimirDatos();
            return true;
        }
        return false;
    }
    
    public boolean eliminarPersonasInvitadas(int id){
        for (int i = 0; i < totalPersonasI; i++) {
            if (personasInvitadas[i].getId() == id){
                for (int j = 0; j < totalPersonasI - 1; j++) {
                 personasInvitadas[j] = personasInvitadas[j + 1];   
                }
                personasInvitadas[totalPersonasI - 1] = null;
                totalPersonasI--;
                System.out.println("Profesor fue eliminado correctamente");
                return true;
            }
        }
    return true;
    }
    public boolean buscarPersonasInvitadas(int id){
    for (int i = 0; i < totalPersonasI; i++) {
                if(personasInvitadas[i].getId()==id){
                    System.out.println("------Personas Invitadas------"+"|"+(i+1)+"|");
                    System.out.println("Nombre: "+ personasInvitadas[i].getNombre());
                    System.out.println("Id de Profesor: "+personasInvitadas[i].getId());
                    System.out.println("Cedula: "+ personasInvitadas[i].getCedula());
                    System.out.println("Correo Personal: "+ personasInvitadas[i].getCorreo());
                    System.out.println("Descripcion: "+ personasInvitadas[i].getDescripcion());
                    System.out.println(" ");
                    return true;
                }
            }
            System.out.println("Codigo no encontrado");
            return false;
    }
}
