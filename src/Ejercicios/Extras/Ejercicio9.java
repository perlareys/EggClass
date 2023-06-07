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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.print("Ingresar el número a dividir: ");
        int num1= leer.nextInt();
        System.out.print("Ingresar el divisor: ");
        int num2= leer.nextInt();
        
        int cociente=0;
        int residuo=num1;
        
        while (residuo>=num2){
            residuo -= num2;
            cociente++;
        }
        System.out.println("El residuo es: "+residuo+", el cociente es: "+cociente);
    }   
}
