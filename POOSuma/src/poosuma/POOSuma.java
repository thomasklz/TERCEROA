/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poosuma;

import clases.Operaciones;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones p = new Operaciones();
        System.out.println("Ingrese el valor del primer numero");
        int a= sc.nextInt();
        System.out.println("Ingrese el valor del segundo numero");
        int b= sc.nextInt();
       
        p.suma(a,b);
              
        p.resta(a,b);
        
        
    }
    
}
