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
public class Ejercicio4 {
    
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
        
        int grados;
        int convert;
        System.out.println("Ingresar los grados Centígrados");
        grados= leer.nextInt();
        convert=32+(9*grados/5);
        System.out.println("Los grados F son: "+convert);
    }    
}
