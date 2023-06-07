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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el número n de la sucesión");
        int n= leer.nextInt();
        
        System.out.println(Arrays.toString(fibonacci(n)));
    }
    public static int[] fibonacci(int n){
        int[] vectorFibonacci= new int[n];
        if(n==1){
            vectorFibonacci[0]=1;
            return vectorFibonacci;
        } else if(n==2){
            vectorFibonacci[0]=1;
            vectorFibonacci[1]=1;
            return vectorFibonacci;
        } else if(n>2){
            vectorFibonacci[0]=1;
            vectorFibonacci[1]=1;
            for (int i = 2; i < n; i++) {
                vectorFibonacci[i]=vectorFibonacci[i-1] + vectorFibonacci[i-2];
            }
        }
        return vectorFibonacci;
    }
}
