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
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int dimension=3;
    int[][] matrizA=crearMatrizA(dimension);
        System.out.println("MATRIZ");
        imprimirMatriz(matrizA);
        System.out.println("MATRIZ TRANSPUESTA");
        imprimirMatriz(matrizTranspuesta(matrizA));
    }
    public static int[][] crearMatrizA(int dimension){
        int[][] matrizA= new int [dimension][dimension]; 
        for (int i = 0; i <dimension; i++) {
            for (int j = 0; j <dimension; j++) {
                matrizA[i][j]=(int) (Math.random()*10);
            }
        }
        return matrizA;
    }
    public static void imprimirMatriz(int[][] matrizA) {
        for (int i = 0; i <matrizA.length; i++) {
            for (int j = 0; j <matrizA.length; j++) {
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] matrizTranspuesta(int[][] matrizA){
        int[][] matrizTranspuesta= new int[matrizA.length][matrizA.length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizTranspuesta[i][j]=matrizA[j][i];
            }
        }
        return matrizTranspuesta;
    }
    
}
