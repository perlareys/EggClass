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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar tiempo en minutos");
        int tiempo= leer.nextInt();
        int dias= tiempo/(25*60);
        int horas= (tiempo%(24*60))/60;
        System.out.println(dias+" día, "+horas+" horas");
    }
    
}
