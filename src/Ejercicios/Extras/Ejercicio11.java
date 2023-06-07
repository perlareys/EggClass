/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Extras;

/**
 *
 * @author Perla
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
        System.out.println("Ingresar un número entero");
        int numero= leer.nextInt();
        int contador=0;
        while (numero!=0){
            numero/=10;
            contador++;
        }
        
        System.out.println("El número ingresado tiene: "+contador+" dígitos");
    } 
}
