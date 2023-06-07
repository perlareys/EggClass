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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese el nombre de la persona");
            String nombre=leer.nextLine();
            System.out.println("Ingrese la edad de la persona");
            int edad= leer.nextInt();
            leer.nextLine();
            if (edad<18){
                System.out.println("La persona es menor de edad");
            } else {
                System.out.println("La persona es mayor de edad");
            }
            System.out.println("¿Desea continuar ingresando información? S/N");
            String respuesta= leer.nextLine().toLowerCase();
            
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }
    }    
}