/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.gob.orellana.www.sistemaacademico;
import ec.gob.orellana.www.sistemaacademico.clases.decanos.Decano;
import ec.gob.orellana.www.sistemaacademico.clases.personasexternas.PersonaInvitada;
import ec.gob.orellana.www.sistemaacademico.clases.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.clases.profesores.Profesor;
import ec.gob.orellana.www.sistemaacademico.clases.*;

public class SistemaAcademico {

    public static void main(String[] args) {
        
    
        
        System.out.println("\nDatos de la persona invitada");
        PersonaInvitada personaInvitada = new PersonaInvitada("Castillo Juan",3,"Juan@gmail.com","254864563","Visita tecnica");
        System.out.println("Datos"+personaInvitada.toString());
        
    
        System.out.println("\nDatos del estudiante");
        Estudiante estudiante = new Estudiante(2,"Pedro@espoch.edu.ec","Pedro",6,"pedro@gmail.com","758647687");
        System.out.println("Datos "+estudiante.toString());
        
        System.out.println("\nDatos del personal de servicio");
        PersonalServicios personalServicios = new PersonalServicios("Espoch Sede Orellana",8,"Josue@espoch.edu.ec","Josue",8,"Josue@gmail.com","9845623567");
        System.out.println("Datos "+personalServicios.toString());
        
        System.out.println("\n Datos del Decano");
        Decano decanos = new Decano ("01", 3000, "xaviertoala@espoch.edu.ec", "Xavier", 10, "xaviertoala10@gmail", "225002588");
        System.out.println("Datos: "+decanos.toString());

        System.out.println("\n Datos del Profesor: ");
        Profesor profesores = new Profesor(Escalafon.PRINCIPAL, 800,"profejulio@espoch", "Julio", 2021, "julio10@gmail", "22500060");
        System.out.println("Datos: "+profesores.toString());
    }
}
