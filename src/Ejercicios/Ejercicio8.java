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
public class Ejercicio8 {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingresarr una palabra o frase de 8 letras");
        frase = leer.nextLine();
        
        if (frase.length()==8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
