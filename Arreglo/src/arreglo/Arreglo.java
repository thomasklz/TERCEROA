/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese el tamano del arreglo");
        int n;
        n= sc.nextInt();
        double v[]= new double [n];
        
        for (int i=0; i<v.length; i++)
        {
            System.out.println("Ingrese un numero");
            v[i]= sc.nextDouble();
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            
        }
        
       
        
    }
    
}
