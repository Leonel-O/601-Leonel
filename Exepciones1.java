
package exepciones1;

import javax.swing.JOptionPane;
/**
 *
 * @author HP 245
 */
public class Exepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int x,y;
        
        try {
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1:", "Solicito datos", 3));
    }catch (NumberFormatException n){
        
        System.out.println (n.getMessage() + " NO ES UN NUMERO ENTERO");
    }

    }
    
}
