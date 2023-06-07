/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
        
        int tamaño= 100;
        System.out.println(Arrays.toString(llenarYmostrar(tamaño)));
    }
    public static int[] llenarYmostrar(int tamaño){
        int[] vector=new int[tamaño];
        for (int i = tamaño-1; i >= 1; i--) {
            vector[tamaño-1-i]=i;
        }
        return vector;
    }
}
