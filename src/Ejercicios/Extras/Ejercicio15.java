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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar el primer número: ");
        int num1= leer.nextInt();
        System.out.print("Ingresar el segundo número: ");
        int num2= leer.nextInt();
        System.out.println("------MENÚ------");
        System.out.println("1.  Sumar");
        System.out.println("2.  Restar");
        System.out.println("3.  Multiplicar");
        System.out.println("4.  Dividir");
        System.out.println("Elegir una opción");
        int eleccion= leer.nextInt();
        
        switch(eleccion) {
            case 1: 
                System.out.println("La suma de los números ingresados es: "+ sumar(num1,num2));
                break;
            case 2:
                System.out.println("La resta de los números ingresados es: "+ restar(num1,num2));
                break;
            case 3:
                System.out.println("El producto de los números ingresados es: "+ multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("La división de los números ingresados es: "+ dividir(num1,num2));
                break;
            default:
                System.out.println("Option not found");
                break;
        }
    }
    
    public static int sumar(int num1, int num2){
        int suma;
        suma= num1 + num2;
        return suma;
    }
    public static int restar(int num1, int num2) {
        int resta;
        resta= num1 - num2;
        return resta;
    }
    public static int multiplicar(int num1, int num2) {
        int producto;
        producto= num1 * num2;
        return producto;
    }
    public static int dividir(int num1, int num2) {
        int division;
        division= num1 / num2;
        return division;
    }
}
