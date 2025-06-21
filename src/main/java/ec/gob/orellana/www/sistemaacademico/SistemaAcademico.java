/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.gob.orellana.www.sistemaacademico;
import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiante;
import ec.gob.orellana.www.sistemaacademico.personasservicios.PersonalServicios;
import ec.gob.orellana.www.sistemaacademico.decanos.Decano;
import ec.gob.orellana.www.sistemaacademico.personasexternas.PersonaInvitada;
import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;
import ec.gob.orellana.www.sistemaacademico.clases.*;
import ec.gob.orellana.www.sistemaacademico.decanos.Decanos;
import ec.gob.orellana.www.sistemaacademico.decanos.IDecanos;
import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiantes;
import ec.gob.orellana.www.sistemaacademico.estudiantes.IEstudiantes;
import ec.gob.orellana.www.sistemaacademico.personasexternas.IPersonasInvitadas;
import ec.gob.orellana.www.sistemaacademico.personasexternas.PersonasInvitadas;
import ec.gob.orellana.www.sistemaacademico.personasservicios.IPersonasServicios;
import ec.gob.orellana.www.sistemaacademico.personasservicios.PersonasServicios;
import ec.gob.orellana.www.sistemaacademico.profesores.IProfesores;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesores;

public class SistemaAcademico {

    public static void main(String[] args) {
        
        //CLASE PROFESOR
        IProfesores objProfesor = new Profesores(3);
        
        Profesor profesorUno = new Profesor(Escalafon.AUXILIAR, 2345,"Juan@espoch.edu.ec", "Juan",2, "juan@espoch.edu.ec", "220046735");
        Profesor profesorDos = new Profesor(Escalafon.AUXILIAR, 2756,"Alex@espoch.edu.ec", "Alex",5, "alex@espoch.edu.ec", "228872628");
        
        Profesor agregoProfesor = new Profesor(Escalafon.PRINCIPAL, 2345, "Josue@espoch.edu.ec", "Josue", 5, "josue@gmail.com", "22546738");
        
        objProfesor.agregarProfesor(profesorUno);
        objProfesor.agregarProfesor(profesorDos);
        objProfesor.agregarProfesor(agregoProfesor);
        objProfesor.imprimirDatos();
        //IProfesores objProfesores  = new Profesores();
        //objProfesores.imprimirDatos(profesor);
        
        //CLASE PERSONA INVITADA
        PersonaInvitada [] personasInvitadas = new PersonaInvitada[1];
        personasInvitadas[0] = new PersonaInvitada("Alexis", 35 , "juan@gmail.com","2250180862" , "Expositor");
       
        IPersonasInvitadas objPersonaInvitada  = new PersonasInvitadas();
        objPersonaInvitada.imprimirDatos(personasInvitadas);
        
        //CLASE PERSONA DE SERVICIO
        PersonalServicios [] personalServicios = new PersonalServicios[1];
        personalServicios[0] = new PersonalServicios(" Espoch ", 500.0 , "Celeste.v@espoch.com", "Celeste" , 36, "Celeste@gmail.com", "2250180862");
       
        IPersonasServicios objPersonaS  = new PersonasServicios();
        objPersonaS.imprimirDatos(personalServicios);
        
        //CLASE DECANO
        Decano [] decano = new Decano [1];
        decano [0] = new Decano ("Gestion de personal", 3000, "xavier@espoch.edu.ec", "Xavier", 10, "xaviertoala@gmail", "22500");
        
        IDecanos objDecano = new Decanos ();
        objDecano.imprimirDatos(decano);
        
        //CLASE ESTUDIANTE
        Estudiante [] estudiante = new Estudiante [1];
        estudiante [0] = new Estudiante (22, "Josue.espoch", "Josue", 3232, "Josue.gmail", "2254021");
        
        IEstudiantes objEstudiante = new Estudiantes ();
        objEstudiante.imprimirDato(estudiante);
        
        
        /*
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
        */
    }
}
