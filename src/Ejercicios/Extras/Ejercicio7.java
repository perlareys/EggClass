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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("¿Cuántos números ingresará?");
        int n= leer.nextInt();
        int numero;
        int contador=0;
        int numMaximo=0;
        int numMinimo=Integer.MAX_VALUE;
        int suma=0;
        
        do {
            System.out.println("Ingrese un número. No debe ser 0");
            numero= leer.nextInt();
            while (numero==0){
                System.out.println("Ingresar nuevamente.");
                numero=leer.nextInt();
            }
            if (numero>numMaximo) {
                numMaximo= numero;
            }
            if (numero<numMinimo) {
                numMinimo = numero;
            }
            suma+=numero;
            contador++;
        } while (contador<n); 
        
        System.out.println("Número máximo: "+numMaximo);
        System.out.println("Número mínimo: "+numMinimo);
        System.out.println("Promedio     : "+ suma/n);
    }   
}
