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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del vector");
        int n= leer.nextInt();
        
        crearVector(n);
        imprimirVector(crearVector(n));
    }
    public static int[] crearVector(int n){
        int[] vector=new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random()*10);
        }
        return vector;
    }
    public static void imprimirVector(int[] vector ){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }
}
