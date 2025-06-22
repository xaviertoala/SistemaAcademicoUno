
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
        for(int i =0; i < totalPersonalS;i++)
        System.out.println("Datos de la persona en servicio :" + personalServicios[i].getGremio());
    }
    
    public boolean actualizarPersonalServicio(int i, PersonalServicios personalServicio){
        personalServicios[i]= personalServicio;
        return true;
    }
}
