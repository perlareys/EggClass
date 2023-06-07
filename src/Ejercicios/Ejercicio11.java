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
public class Ejercicio11 {

    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
    int numero1;
    int numero2;
    boolean salida=false;
    System.out.println("Ingrese el primer número entero positivo");
    numero1 = leer.nextInt();
    System.out.println("Ingrese el segundo número entero positivo");
    numero2 = leer.nextInt();

    int eleccion;
        System.out.println("-------MENÚ--------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        do {
          
          System.out.println("Elija una opción");
          eleccion = leer.nextInt();
          switch (eleccion) {
             case 1:
                   System.out.println("La suma es: "+(numero1 + numero2));
                   break;
               case 2:
                   System.out.println("La resta es: "+(numero1-numero2));
                   break;
               case 3: 
                   System.out.println("La multiplicación es: "+(numero1 * numero2));
                   break;
               case 4:
                   System.out.println("La división es: "+(numero1 / numero2));
                   break;
               case 5:                   
                   System.out.println("¿Está seguro que desea salir del programa? (S/N)");
                   String respuesta = leer.next();
                   if (respuesta.equals("S")) {
                       salida=true;
                   } 
                   break;
                default:
                    System.out.println("¡OPCIÓN INVÁLIDA!");
                    break;               
            }  
        }while (!salida);
    }    
}
