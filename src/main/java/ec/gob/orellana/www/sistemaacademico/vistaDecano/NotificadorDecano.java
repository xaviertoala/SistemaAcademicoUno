
package ec.gob.orellana.www.sistemaacademico.vistaDecano;

import javax.swing.JOptionPane;


public class NotificadorDecano {
    
    public void notificadorDecano (String mensaje){
        JOptionPane.showMessageDialog(null, mensaje,"Informacion", JOptionPane.INFORMATION_MESSAGE );
    }
}
