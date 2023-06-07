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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double promedio=0;
        int aprobado=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Alumno "+i);
            System.out.print("Primer trabajo práctico: "); 
            double practico1= leer.nextInt();
            System.out.print("Segundo trabajo práctico: ");
            double practico2= leer.nextInt();
            System.out.print("Primer integrador: ");
            double integrador1= leer.nextInt();
            System.out.print("Segundo integrador: ");
            double integrador2= leer.nextInt();
            
            promedio=practico1*0.1 + practico2*0.15 + integrador1*0.25 + integrador2*0.5;
            System.out.println("El promedio del alumno "+i+" es: "+promedio);
            
            if (promedio<7){
                System.out.println("Alumno "+i+" desaprobado");   
            } else{
                System.out.println("Alumno "+i+" aprobado");
                aprobado++;
            }
        }
        System.out.println("Total de alumnos aprobados: "+aprobado);
        System.out.println("Total de alumnos desaprobados: "+ (10-aprobado));
    }
    
}
