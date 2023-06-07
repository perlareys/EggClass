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
public class Ejercicio6 {

     public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
     
     int numero;
         System.out.println("Ingresar un número");
         numero= leer.nextInt();
         
         if (numero%2==0){
             System.out.println("El número ingresado es par");
         } else{
             System.out.println("El número ingresado es impar");
         }
         
     }
}
