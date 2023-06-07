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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int numero1=(int) (Math.random()*10);
        int numero2=(int) (Math.random()*10);
        
        System.out.println("Ingresar el resultado de la multiplicación: "+ numero1 + "*" + numero2);
        int respuesta= leer.nextInt();
        int resultado= numero1*numero2;
        
        while (respuesta != resultado) {
            System.out.println("Respuesta Incorrecta. Intentar nuevamente");
            respuesta= leer.nextInt();
        }
        System.out.println("Respuesta correcta");
    }    
}
