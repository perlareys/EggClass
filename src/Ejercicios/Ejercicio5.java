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
public class Ejercicio5 {

    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
    int numero;    
    System.out.println("Ingresar un número entero");
        numero= leer.nextInt();
        
        System.out.println("El doble de número es: "+ (numero*2));
        System.out.println("El triple del número es: "+ (numero*3));
        System.out.println("La raiz  cuadradra del número es: "+ Math.sqrt(numero));
    }
}
