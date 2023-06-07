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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrizM={ { 1,26,36,47, 5, 6,72,81,95,10},
                         {11,12,13,21,41,22,67,20,10,61}, 
                         {56,78,87,90, 9,90,17,12,87,67},
                         {41,87,24,56,97,74,87,42,64,35},
                         {32,76,79, 1,36, 5,67,96,12,11},
                         {99,13,54,88,89,90,75,12,41,76},
                         {67,78,87,45,14,22,26,42,56,78},
                         {98,45,34,23,32,56,74,16,19,18},
                         {24,67,97,46,87,13,67,89,93,24},
                         {21,68,78,98,90,67,12,41,65,12} };
        int[][]matrizP= { {36, 5,67},
                                {89,90,75},
                                {14,22,26}};
    
        //traigo los resultado de las funciones
        boolean matrizEncontrada=verificarSubmatriz(matrizM, matrizP);
        if (matrizEncontrada) {
            System.out.println("La matriz P ESTÁ dentro de la matriz M");
        } else {
            System.out.println("La matriz P NO está dentro de la matriz M");
        }
    }
    public static boolean verificarSubmatriz(int[][]matrizM, int[][] matrizP){
        int tamañoM=matrizM.length;
        int tamañoP=matrizP.length;
        
        //con esto busco las matriz de 3x3 que hay en M
        for (int i = 0; i <= tamañoM - tamañoP; i++) {
            for (int j = 0; j <= tamañoM - tamañoP; j++) {
                boolean coinciden=true;
                                
                //con esto veo si la matriz encontrada antes es igual a P
                for (int k = 0; k < tamañoP; k++) {
                    for (int l = 0; l < tamañoP; l++) {
                        if (matrizM[i+k][j+l] != matrizP[k][l]){
                            coinciden=false;
                            break;
                    }
                }
                if (!coinciden){
                    break;
                }
            }
            //si se cumple que está  dentro y coinciden, entonces:
            if (coinciden){
                return true;
            }
        }
    }
     return false;   
    }
    
}
