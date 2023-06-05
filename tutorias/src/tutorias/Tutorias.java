/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorias;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Tutorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        System.out.println("Ingrese una letra");
        letra=sc.nextLine().charAt(0);
        switch (letra) {
            case 'a':
                System.out.println("es una vocal");
                break;
                case 'e':
                System.out.println("es una vocal");
                break;
                case 'i':
                System.out.println("es una vocal");
                break;
                case 'o':
                System.out.println("es una vocal");
                break;
                case 'u':
                System.out.println("es una vocal");
                break;
             
            default:
                System.out.println("es error");
                break;
        }
        
        
       
    }
    
}
