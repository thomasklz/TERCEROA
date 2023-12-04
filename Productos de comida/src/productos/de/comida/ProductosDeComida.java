/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productos.de.comida;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ProductosDeComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
      /*  System.out.println("Ingrese el tamano del vector");
        int tamano = sc.nextInt();
        String [] comida = new String[tamano];
        sc.nextLine();
        System.out.println("Ingrese "+ tamano + " productos de comida");
        for (int i = 0; i < tamano; i++) {
            System.out.println("Producto: "+(i+1) );
            comida[i]= sc.nextLine();
        }
        
        for (int i = 0; i < tamano; i++) {
            if(comida[i].charAt(0)=='J'|| comida[i].charAt(0)=='A'||comida[i].charAt(0)=='C'
                || comida[i].charAt(0)=='j'|| comida[i].charAt(0)=='a'||comida[i].charAt(0)=='c'){
                System.out.println("Producto: "+comida[i] );
            }
        }*/
      
        for (int i = 1; i <= 12; i++) {
            System.out.println("Tabla del "+ i);
            for (int j = 1; j <= 12; j++) {
                System.out.println( i + " * " + j + " = " + (i*j));
            }
            System.out.println("---------------------------------");
        }
      
    }
    
}
