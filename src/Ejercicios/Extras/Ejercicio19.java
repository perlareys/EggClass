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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el tamaño de los vectores");
        int tamaño= leer.nextInt();
        int[] vector1= new int[tamaño];
        int[] vector2= new int[tamaño];
        
        System.out.println("VECTOR 1");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingresar el valor de la posicion "+i);
            vector1[i]=leer.nextInt();
        }
        System.out.println("VECTOR 2");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingresar el valor de la posicion "+i);
            vector2[i]=leer.nextInt();
        }
        System.out.println("VECTOR 1");
        System.out.println(Arrays.toString(vector1));
        System.out.println("VECTOR 2");
        System.out.println(Arrays.toString(vector2));
        
        if(comparacion(vector1, vector2)){
            System.out.println("Los elementos de ambos vectores son iguales");
        } else{
            System.out.println("Los vectores no son iguales");
        }
    }
    public static boolean comparacion(int[] vector1, int[] vector2) {
        for (int i = 0; i <vector1.length ; i++) {
            if (vector1[i] != vector2[i]){
                return false;
            }
        }
     return true;
    }
}