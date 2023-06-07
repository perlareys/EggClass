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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un número entre 1 y 10");
        int numero= leer.nextInt();
        while (numero<1 || numero>10){
            System.out.println("Número fuera de rango.Intentar nuevamente");
            numero= leer.nextInt();
        }
        System.out.println("Número Romano:");
     switch (numero) {
         case 1:
             System.out.println("I");
             break;
         case 2:
             System.out.println("II");
             break;
         case 3:
             System.out.println("III");
             break;
         case 4:
             System.out.println("IV");
             break;
         case 5:
             System.out.println("V");
             break;
         case 6:
             System.out.println("VI");
             break;
         case 7:
             System.out.println("VII");
             break;
         case 8:
             System.out.println("VIII");
             break;
         case 9:
             System.out.println("IX");
             break;
         default:
             System.out.println("X");
             break;
     }   
    }
    
}
