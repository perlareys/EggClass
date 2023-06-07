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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el costo del tratamiento");
        int costo= leer.nextInt();
        System.out.println("ELEGIR EL TIPO DE SOCIO");
        System.out.println("Socio :  A");
        System.out.println("Socio :  B");
        System.out.println("Socio :  C");
        String socio= leer.next();
        
       switch (socio) {
           case "a":
           case "A":
               System.out.println("El monto a pagar es: "+(costo-(costo*0.5)));
               break;
           case "b":
           case "B":
               System.out.println("El monto a pagar es: "+ (costo-(costo*0.35)));
               break;
           case "c":
           case "C":
               System.out.println("El monto a pagar es: "+ costo);
               break;
           default:
               System.out.println("Socio Not Found!");
               break;
       } 
    }
    
}
