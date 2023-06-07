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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un número");
        int numero= leer.nextInt();
        
        if (validarPrimo(numero)){
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado no es primo");
        }
    }
    public static boolean validarPrimo(int numero) {
       for (int i = 2; i <numero ; i++) {
           if (numero==2){
               return true;
           } else {
             if (numero%i==0) {
                return false;
             }  
           }   
        }
       return true; 
    }    
}