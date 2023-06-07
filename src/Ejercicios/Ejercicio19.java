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
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz= {{0,-2,4},
                        {2,0,2},
                        {-4,-2,0}};
       int[][] transpuesta= transponer(matriz);
       antiSimetrica(matriz, transpuesta);
       }
    public static int[][] transponer(int[][] matriz) {
        int[][] transpuesta= new int[matriz.length][matriz.length];
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++) {
                transpuesta[i][j]=matriz[j][i];
            }
        }
        return transpuesta;
    }
    public static void antiSimetrica(int[][] matriz, int[][] transpuesta){
        boolean simetrica=true;
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j]==(transpuesta[i][j])*-1) {
                } else {
                    simetrica=false;
                    break;
                }
            }
        }
        if (simetrica) {
            System.out.println("ES anti simétrica");
        } else {
            System.out.println("NO es anti simétrica");
        }
    }
}