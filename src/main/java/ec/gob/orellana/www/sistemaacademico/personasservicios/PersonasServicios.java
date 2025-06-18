
package ec.gob.orellana.www.sistemaacademico.personasservicios;


public class PersonasServicios implements IPersonasServicios{
 
     public String agregarPersonalServicio(){
        return "";
    }
        public void imprimirDatos (PersonalServicios [] personalServicios){
        for(int i =0; i < personalServicios.length;i++)
        System.out.println("Datos de la persona en servicio :" + personalServicios[i].toString());
    }
}
