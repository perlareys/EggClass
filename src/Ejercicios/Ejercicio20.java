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
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz= new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingresa el valor de la posición "+i+","+j+ " : ");
                matriz[i][j]=leer.nextInt();
                while (matriz[i][j]<1 || matriz[i][j]>9){
                    System.out.println("El número debe estar entre 1 y 9. Ingrese nuevamente");
                    matriz[i][j]=leer.nextInt();
                }
            }
        }
        System.out.println("MATRIZ");
        imprimirMatriz(matriz);
        
        boolean esMagico=cuadradoMagico(matriz);
        if (esMagico) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
        
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static boolean cuadradoMagico(int[][] matriz) {
        int suma= matriz[0][0] + matriz[0][1] + matriz[0][2];
        
        //comenzamos verificando filas
        for (int i = 0; i < 3; i++) {
            int sumaFila= matriz[i][0]+matriz[i][1]+matriz[i][2];
            if (sumaFila != suma) {
                return false;
            }
        }
        
        //ahora verificamos columnas
        for (int j = 0; j < 3; j++) {
            int sumaColumna= matriz[0][j]+matriz[1][j]+matriz[2][j];
            if (sumaColumna != suma){
                return false;
            }
        }
        
        //verificamos diagonales principal y secundaria
        int diagPrincipal= matriz[0][0]+matriz[1][1]+matriz[2][2];
        int diagSecundaria= matriz[0][2]+matriz[1][1]+matriz[2][0];
        return diagPrincipal==suma && diagSecundaria==suma;
    }
}
