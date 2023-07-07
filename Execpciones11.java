/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execpciones11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author HP 245
 */
public class Execpciones11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("¡Se produjo una excepción de archivo no encontrado!");
            System.out.println("El archivo no existe o no se puede acceder.");
            System.out.println("Mensaje: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("¡Se produjo una excepción de E/S!");
            System.out.println("Ocurrió un error al leer el archivo.");
            System.out.println("Mensaje: " + e.getMessage());
        }
    }
    
}
