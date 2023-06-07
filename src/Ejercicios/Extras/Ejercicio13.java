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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar altura");
        int numero= leer.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }  
}
