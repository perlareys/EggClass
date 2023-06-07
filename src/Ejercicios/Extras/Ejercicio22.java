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
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el valor de n");
        int n=leer.nextInt();
        System.out.println("Ingresar el valor de m");
        int m=leer.nextInt();
        int[][] matriz= new int[n][m];
        
        llenarMatriz(matriz);
        System.out.println("MATRIZ:");
        imprimirMatriz(matriz);
        int suma= sumarElementos(matriz);
        System.out.println("La suma de los elementos de la matriz es: "+suma);
    }
    public static void llenarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=(int) (Math.random()*20);
            }
        }
    }
    public static void imprimirMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static int sumarElementos(int[][] matriz){
        int suma=0;
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma+= matriz[i][j];
            }
        }
        return suma;
    }
}
