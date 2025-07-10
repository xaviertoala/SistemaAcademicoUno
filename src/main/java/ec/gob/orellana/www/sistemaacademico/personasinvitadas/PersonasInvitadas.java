package ec.gob.orellana.www.sistemaacademico.personasinvitadas;

public class PersonasInvitadas implements IPersonasInvitadas {

    private PersonaInvitada[] personasInvitadas;
    private int totalPersonasI;

    public PersonasInvitadas(int dimension) {
        personasInvitadas = new PersonaInvitada[dimension];
        totalPersonasI = 0;
    }

    public boolean agregarpersonaInvitada(PersonaInvitada personaInvitada) {
        if (totalPersonasI == personasInvitadas.length) {
            return false;
        } else {
            personasInvitadas[totalPersonasI] = personaInvitada;
            totalPersonasI = totalPersonasI + 1;
            return true;
        }
    }

    public void imprimirDatos() {
        for (int i = 0; i < totalPersonasI; i++) {
            System.out.println("------Personas Invitadas------" + "|" + (i + 1) + "|");
            System.out.println("Nombre: " + personasInvitadas[i].getNombre());
            System.out.println("ID: " + personasInvitadas[i].getId());
            System.out.println("Cedula: " + personasInvitadas[i].getCedula());
            System.out.println("Correo Personal: " + personasInvitadas[i].getCorreo());
            System.out.println("Descripcion: " + personasInvitadas[i].getDescripcion());
            System.out.println(" ");

        }
    }

    @Override
    public boolean actualizarPersonaInvitada(int id, PersonaInvitada persoonaInvitada) {
        for (int i = 0; i < totalPersonasI; i++) {
            if (personasInvitadas[i].getId() == id) {
                personasInvitadas[i] = persoonaInvitada;
                imprimirDatos();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean eliminarPersonasInvitadas(int id) {
        for (int i = 0; i < totalPersonasI; i++) {
            if (personasInvitadas[i].getId() == id) {
                for (int j = i; j < totalPersonasI - 1; j++) {
                    personasInvitadas[j] = personasInvitadas[j + 1];
                }
                personasInvitadas[totalPersonasI - 1] = null;
                totalPersonasI--;
                return true;
            }
        }
        return true;
    }

    @Override
    public PersonaInvitada buscarPersonasInvitadas(int id) {
        for (int i = 0; i < totalPersonasI; i++) {
            if (personasInvitadas[i].getId() == id) {
                return personasInvitadas[i];
            }
        }
        return null;
    }
}
