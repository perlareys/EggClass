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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digit1 = Integer.toString(i);
                    String digit2 = Integer.toString(j);
                    String digit3 = Integer.toString(k);
                    
                    if (digit3.equals("3")) {
                        System.out.println(digit1 + "-" + digit2 + "-" + "E");
                    } else {
                        if (digit2.equals("3")) {
                            System.out.println(digit1 + "-" + "E" + "-" + digit3);
                        } else {
                            if (digit1.equals("3")) {
                                System.out.println("E" + "-" + digit2 + "-" + digit3);
                            } else {
                               System.out.println(digit1 + "-" + digit2 + "-" + digit3); 
                            }
                        }   
                    }
                }
            }
        }
    }   
}