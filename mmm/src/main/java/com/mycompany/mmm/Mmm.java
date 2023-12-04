/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mmm;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Mmm {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = 0;
        System.out.println("Ingrese el tamano del vector");
        num = sc.nextInt();
        String [] array = new String[num];
        
        
        
        sc.nextLine();
        for(int i=0 ; i < array.length ; i++){
        array[i] = sc.nextLine();
        }
        
         for(int i=0 ; i < array.length ; i++){
             System.out.println("La palabra/caracter " + array[i] 
             + " tiene " + array[i].length() + " caracteres."
                     );
        }
                
        
    }
}
