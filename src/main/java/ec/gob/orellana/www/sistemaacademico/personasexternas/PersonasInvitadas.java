
package ec.gob.orellana.www.sistemaacademico.personasexternas;


public class PersonasInvitadas implements IPersonasInvitadas {
    public String agregarpersonaInvitada(){
        return "";
    }
    
    public void imprimirDatos (PersonaInvitada[]personasInvitadas){
        for (int i = 0; i < personasInvitadas.length; i++) {
            System.out.println("Datos de la persona invitada : " + personasInvitadas[i].toString());
        }
    }
}
