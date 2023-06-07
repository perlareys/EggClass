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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de familias");
        int n= leer.nextInt();
        int suma=0;
        for (int i = 1; i <=n; i++) {
            System.out.println("Ingresar la cantidad de hijos de la familia "+i);
            int m= leer.nextInt();
            suma+=m;
        }
        System.out.println("La media de hijos es de: "+ suma/n);
    }   
}
