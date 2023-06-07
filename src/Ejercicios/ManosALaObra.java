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
public class ManosALaObra {

      

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //construimos el cuadrado mágico
        int[][] matriz = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Ingrese el valor de la posición");
                matriz[i][j] = leer.nextInt();
            }
        }
    }
}