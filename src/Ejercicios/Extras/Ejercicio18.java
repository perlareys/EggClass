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
import java.util.Arrays;
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del vector");
        int n= leer.nextInt();
        
        int[] vector= new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Ingresar el valor de posición "+i);
            vector[i]= leer.nextInt();
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("La suma de los elementos del vector es: "+sumaVector(vector));
    }
    public static int sumaVector(int[] vector){
       int suma=0;
       for (int i:vector){
           suma+= i;
       }
       return suma;
    }
}
