package ec.gob.orellana.www.sistemaacademico.personasservicios;

public class PersonasServicios implements IPersonasServicios {

    private PersonalServicios[] personalServicios;
    private int totalPersonalS;

    public PersonasServicios(int dimension) {
        personalServicios = new PersonalServicios[dimension];
        totalPersonalS = 0;
    }

    public boolean agregarPersonalServicio(PersonalServicios personalServicio) {
        if (totalPersonalS == personalServicios.length) {
            return false;
        } else {
            personalServicios[totalPersonalS] = personalServicio;
            totalPersonalS = totalPersonalS + 1;
            return true;
        }
    }

    @Override
    public void imprimirDatos() {
        for (int i = 0; i < totalPersonalS; i++) {
            System.out.println("------Personas Servicio------" + "|" + (i + 1) + "|");
            System.out.println("Nombre: " + personalServicios[i].getNombre());
            System.out.println("Cedula: " + personalServicios[i].getCedula());
            System.out.println("Correo Personal: " + personalServicios[i].getCorreo());
            System.out.println("Correo Institucional: " + personalServicios[i].getCorreoInstitucional());
            System.out.println("Sueldo: " + personalServicios[i].getSueldo());
            System.out.println("Gremio: " + personalServicios[i].getGremio());
            System.out.println(" ");
        }
    }

    @Override
    public boolean actualizarPersonalServicio(int id, PersonalServicios personaServicios) {
        for (int i = 0; i < totalPersonalS; i++) {
            personalServicios[i] = personaServicios;
            imprimirDatos();
            return true;
        }
        return false;
    }

    public boolean eliminarPersonalServicio(int id) {
        for (int i = 0; i < totalPersonalS; i++) {
            if (personalServicios[i].getId() == id) {
                for (int j = i; j < totalPersonalS - 1; j++) {
                    personalServicios[j] = personalServicios[j + 1];
                }
                personalServicios[totalPersonalS - 1] = null;
                totalPersonalS--;
                return true;
            }
        }
        return false;
    }

    public boolean buscarPersonalServicio(int id) {
        for (int i = 0; i < totalPersonalS; i++) {
            if (personalServicios[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
}
