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
public class Ejercicio9 {

    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);

    String frase;
        System.out.println("Ingresar una palabra o frase que comience con A");
        frase = leer.nextLine();
        
        String primeraLetra= frase.substring(0,1);
        
        if (primeraLetra.equals("A")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }    
}
