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
public class Ejercicio10 {

     public static void main(String[] args){
     Scanner leer = new Scanner(System.in);
        
        int limite;
        int suma=0;
        int numero;
         System.out.println("Ingresar un valor límite positivo");
         limite = leer.nextInt();
         
         while (true){
             System.out.println("Ingrese un número");
             numero= leer.nextInt();
             suma+=numero;
          if (suma>limite){
              break;
          }  
         }
          System.out.println("La suma de los números ingresados es: "+suma);
     }
}
