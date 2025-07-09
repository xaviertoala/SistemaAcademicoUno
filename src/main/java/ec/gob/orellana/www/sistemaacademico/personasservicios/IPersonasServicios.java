package ec.gob.orellana.www.sistemaacademico.personasservicios;

public interface IPersonasServicios {

    public boolean agregarPersonalServicio(PersonalServicios personalServicios);
    public void imprimirDatos();
    public boolean actualizarPersonalServicio(int i, PersonalServicios personalServicios);
    public boolean eliminarPersonalServicio(int id);
    public boolean buscarPersonalServicio(int id);

}
