package Ejercicios;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String cadena;
    int correcto=0;
    int fallido=0;
    
    
    
    while (true){
        System.out.println("Ingresar secuencia");
        cadena = leer.nextLine();
        String primera=cadena.substring(0,1);
        String ultima=cadena.substring(3,4);
        
        if (cadena.equals("&&&&&")){
            break;
        } else if ( primera.equals("X")&& ultima.equals("O")&& cadena.length()==5) {
            correcto+=1;
        } else {
            fallido+=1;
        }        
    } 
        System.out.println("Total de lecturas correctas: "+correcto);
        System.out.println("Total de lecturas fallidas: "+fallido);
    }
}