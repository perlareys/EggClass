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
public class Ejercicio13 {

     public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
     int numero;
         System.out.println("Ingresar el tamaño del elemento");
         numero = leer.nextInt();
         
         for (int i = 1; i <= numero; i++) {
             for (int j = 1; j <= numero ; j++) {
                 if (i==1 || i== numero || j==1 || j== numero) {
                     System.out.print(" * ");
                 } else {
                     System.out.print("   ");
                 }
             }
             System.out.println("");   
         }
 }    
}
