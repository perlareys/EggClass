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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar el valor de A: ");
        int A= leer.nextInt();
        System.out.print("Ingresar el valor de B: ");
        int B= leer.nextInt();
        System.out.print("Ingresar el valor de C: ");
        int C= leer.nextInt();
        System.out.print("Ingresar el valor de D: ");
        int D= leer.nextInt();
        
        int aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("El nuevo valor de A es: "+A);
        System.out.println("El nuevo valor de B es: "+B);
        System.out.println("El nuevo valor de C es: "+C);
        System.out.println("El nuevo valor de D es: "+D);
    }
}
