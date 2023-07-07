/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones9;

/**
 *
 * @author HP 245
 */
public class Excepciones9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            Person person = null;
            String name = person.getName(); // Genera la excepción NullPointerException
            System.out.println("Nombre de la persona: " + name);
        } catch (NullPointerException e) {
            System.out.println("¡Se produjo una excepción!");
            System.out.println("Se intentó acceder a un objeto nulo.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
}
class Person {
    private String name;

    public String getName() {
        return name;
    }
    
}
