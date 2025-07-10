
package ec.gob.orellana.www.sistemaacademico.personasinvitadas;


public interface IPersonasInvitadas {
    public boolean agregarpersonaInvitada(PersonaInvitada personasInvitadas);
    public void imprimirDatos ();
    public boolean actualizarPersonaInvitada (int i, PersonaInvitada persoonaInvitada );
    public boolean eliminarPersonasInvitadas(int id);
    public PersonaInvitada buscarPersonasInvitadas(int id);
    
}
