/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosumapares;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ArregloSumaPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamano del arreglo");
        int t = sc.nextInt();
        int suma=0;
        int n;
        int [] numero = new int [t];
        //n=4
        for (int i = 0; i < t; i++) {
            do {                
                System.out.println("ingresa un numero en la ubicacion "+i);
                n= sc.nextInt();
                numero[i]=n;
            } while (n%2!=0);
         
        }
        
        for (int i = 0; i < t; i++) {
            suma+=numero[i];
        }
    }
    
}
