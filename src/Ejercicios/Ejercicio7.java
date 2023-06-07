/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Perla
 */
import java.util.Scanner;
public class Ejercicio7 {
    
    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
        
        String frase;
        System.out.println("Escribir una frase");
        frase= leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
}
