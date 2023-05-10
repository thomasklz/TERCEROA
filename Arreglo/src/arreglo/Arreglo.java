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
        int [] numero = new int [4];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Ingresa un numero "+i);
            numero[i]=sc.nextInt();
        }
           
        for (int i = 0; i < 10; i++) {
            System.out.println("---- "+numero[i]);
        }
    }
    
}
