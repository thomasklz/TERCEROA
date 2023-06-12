/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poovectore;

import clases.Vector;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOVectorE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Vector v = new Vector();
        System.out.println("Ingrese el tamano del vector");
        v.v=sc.nextInt();
        v.numeros = new int [v.v];
        for (int i = 0; i < v.numeros.length; i++) {
            System.out.println("Ingrese un valor en la posicion "+i);
            int valor= sc.nextInt();
            v.guardar(i, valor); 
        }
        System.out.println("***************MOSTRAR********************");
        v.mostrar();
        System.out.println("***************BUSCAR********************"); 
      
        boolean es;
        do {        
            System.out.println("Ingresa el numero a buscar");
            int b=sc.nextInt();
            es = v.buscar(b);
        } while (es != true);
        
       
   // 
    }
    
}
