
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
            System.out.println("Datos de la persona invitada : " + personasInvitadas[i].getDescripcion());
            
        }
    }
    
    public boolean actualizarPersonaInvitada(int i, PersonaInvitada personaInvitada){
        personasInvitadas[i]= personaInvitada;
        return true;
    }
}
