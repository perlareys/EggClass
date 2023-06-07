/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
public class Ejercicio14 {
  public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor en euros a convertir");
        double cantidad= leer.nextDouble();
        System.out.println("Seleccione el tipo de moneda");
        System.out.println("1.  Dólares");
        System.out.println("2.  Yenes");
        System.out.println("3.  Libras");
        int moneda=leer.nextInt();
        
        switch(moneda) {
            case 1:
                convertir(cantidad, 1);
                break;
            case 2:
                convertir(cantidad,2);
                break;
            case 3:
                convertir(cantidad,3);
                break;
            default:
                convertir(cantidad, moneda);
  }
    }
  public static void convertir (double cantidad, int moneda){
      switch (moneda) {
          case 1:
              System.out.println(cantidad+ "€ equivale  a: "+ (cantidad*1.28611) + " $");
              break;
          case 2:
              System.out.println(cantidad+ "€ equivale  a: " + (cantidad*129.852)+ " yenes");
              break;
          case 3:
              System.out.println(cantidad+ "€ equivale  a: " + (cantidad*0.86)+ " libras");
              break;
          default:
              System.out.println("opción incorrecta");
      }
  }
}
