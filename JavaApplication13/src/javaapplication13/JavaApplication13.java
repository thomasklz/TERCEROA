/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
       int n;
       int imp=0;
         System.out.println("Ingrese numero");
            n=sc.nextInt();
        for (int i = 0; i < n; i++) {
          
            imp=2*n-1;
            
            
            for (int j = 0; j < n; j++) {
                System.out.println("Lis numeros impares son "+ imp);
            }
        }
         
      
        
    }
    
}
