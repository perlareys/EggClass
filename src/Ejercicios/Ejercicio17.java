/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Perla
 */
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del vector");
        int dimension=leer.nextInt();
       int[] vector= crearVector(dimension);
       System.out.println(Arrays.toString(vector));
       int[] conteoDigitos= new int[6];
       
       for (int elemento:vector){
           int digitos=contarDigitos(elemento);
           if (digitos>=1 && digitos<=5) {
               conteoDigitos[digitos]++;
           }
       }
        for (int i = 1; i <=5; i++) {
            System.out.println("Números de "+i+ " dígitos: "+conteoDigitos[i]);
        }
    }
    public static int[] crearVector(int dimension) {
        int[] vector= new int[dimension];
        for (int i = 0; i < dimension; i++) {
            vector[i]=(int) (Math.random()*100000);
        }
        return vector;
    }
    public static int contarDigitos(int elemento){
        int contador=0;
        if (elemento==0){
           contador=1; 
        }
        while (elemento!=0){
            elemento/=10;
            contador++;
        }
        return contador;
    }
}
