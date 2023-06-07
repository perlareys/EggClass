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
public class Ejercicio1 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    int num1;
    int num2;
    int suma=0;
    
        System.out.println("Ingresar un número");
        num1= leer.nextInt();
        System.out.println("Ingresar otro número");
        num2= leer.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los números ingresados es: "+suma);
}    
}
