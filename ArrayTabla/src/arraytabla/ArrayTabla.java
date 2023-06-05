/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytabla;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ArrayTabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre= sc.nextLine();
       
        char [] v = new char[nombre.length()];
        
        for (int i = 0; i < nombre.length(); i++) {
            v[i]= nombre.charAt(i) ;
        }
         for (int i = 0; i < nombre.length(); i++) {
             System.out.println(v[i]);
        }
        
               

        
    }
    
}
