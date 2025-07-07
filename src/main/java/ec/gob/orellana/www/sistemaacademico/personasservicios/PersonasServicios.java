
package ec.gob.orellana.www.sistemaacademico.personasservicios;


public class PersonasServicios implements IPersonasServicios{
    
    private PersonalServicios [] personalServicios;
    private int totalPersonalS;

    public PersonasServicios(int dimension) {
        personalServicios = new PersonalServicios[dimension];
        totalPersonalS=0;
    }
    
    public boolean agregarPersonalServicio(PersonalServicios personalServicio){
        if(totalPersonalS == personalServicios.length){
             return false;     
        }else{
            personalServicios[totalPersonalS] = personalServicio;
            totalPersonalS = totalPersonalS +1 ;
            return true;    
        }        
    }
    
    public void imprimirDatos (){
        for(int i =0; i < totalPersonalS;i++){
            System.out.println("------Personas Servicio------"+"|"+(i+1)+"|");
            System.out.println("Nombre: "+ personalServicios[i].getNombre());
            System.out.println("Cedula: "+ personalServicios[i].getCedula());
            System.out.println("Correo Personal: "+ personalServicios[i].getCorreo());
            System.out.println("Correo Institucional: "+ personalServicios[i].getCorreoInstitucional());
            System.out.println("Sueldo: "+ personalServicios[i].getSueldo());
            System.out.println("Gremio: "+ personalServicios[i].getGremio());
            System.out.println(" ");
        }    
    }
    
    public boolean actualizarPersonalServicio(int i, PersonalServicios personalServicio){
        personalServicios[i]= personalServicio;
        return true;
    }
}
