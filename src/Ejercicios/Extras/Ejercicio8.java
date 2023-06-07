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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n=0;
        int pares=0;
        int impares=0;
        
        while(true){
            System.out.println("Ingrese un número");
            int numero= leer.nextInt();
            n++;
            if (numero<=0){
                continue;
            }
            
            if (numero%2==0){
                pares++;
            } else {
                impares++;
            }
            
            if (numero%5 ==0){
                
                break;
            }    
        }
        System.out.println("El total de números ingresados es: "+n);
        System.out.println("El total de números pares ingresados es: "+pares);
        System.out.println("El total de números impares ingresados es: "+impares);
    }   
}