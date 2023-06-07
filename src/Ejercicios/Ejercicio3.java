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
public class Ejercicio3 {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);

    String frase;
        System.out.println("Ingresar una frase");
        frase= leer.nextLine();
        System.out.println("Frase en minúsculas: ");
        System.out.println(frase.toLowerCase());
        System.out.println("Frase en mayúsculas: ");
        System.out.println(frase.toUpperCase());
    }
}
