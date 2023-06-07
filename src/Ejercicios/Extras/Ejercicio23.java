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
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabra= new String[5];
        for (int i =1; i <palabra.length; i++) {
            do{
                System.out.println("Ingrese la palabra "+i+ " a la sopa de letras");
                palabra[i]= leer.nextLine();
                if(palabra[i].length()<3 || palabra[i].length()>5){
                    System.out.println("La palabra debe estar entre 3 y 5 letras");
                }
            } while(palabra[i].length()<3 || palabra[i].length()>5);
        }
    }
    public static String[][] crearSopa(String[] palabra){
        String[][] sopaLetras= new String[20][20];
    }
}
