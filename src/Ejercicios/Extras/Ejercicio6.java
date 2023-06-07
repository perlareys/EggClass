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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar el número de personas a registrar");
        int n= leer.nextInt();
        double altura;
        double sumaGeneral=0;
        int contador=0;
        double sumaMenor=0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingresar la altura de persona "+i);
            altura= leer.nextDouble();
              
            sumaGeneral +=altura;

            if (altura<1.6) {            
            contador +=1;            
            sumaMenor +=altura;
            }
        }
        
        System.out.println("El promedio de alturas por debajo de 1.6 metros es: "+ sumaMenor/contador);
        System.out.println("El promedio de alturas en general es :"+ sumaGeneral/n);
    }   
}
