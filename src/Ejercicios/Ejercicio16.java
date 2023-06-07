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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Ingresar el tamaño del vector :");
        int dimension= leer.nextInt();
        System.out.print("Ingrese el número a buscar: ");
        int buscar=leer.nextInt();
        encontrarValor(crearVector(dimension), buscar);
    }
    public static int[] crearVector(int dimension) {
    int[] vectorAleatorio = new int[dimension];
        for (int i = 0; i <dimension ; i++) {
            vectorAleatorio[i]= (int) (Math.random()*10);
        }
        return vectorAleatorio;
    }
    public static void encontrarValor(int[] vector, int buscar) {
        int contador=0;
        System.out.println(Arrays.toString(vector));
        
        for (int i = 0; i <vector.length; i++) {
            if (vector[i]==buscar) {
                contador +=1;
                if (contador==1) {
                    System.out.println("La posición de "+ buscar+" es: "+i);
                }
            }
        }
        if (contador==0) {
            System.out.println("No encontrado");
        } else {
            System.out.println(buscar+" se encontró "+contador+" veces");
        }
    }
}
