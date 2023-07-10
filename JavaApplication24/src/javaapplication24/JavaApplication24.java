/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import clases.Auto;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto auto = new Auto();
        int op;
         do {            
              System.out.println("********************");
        System.out.println("MENÚ");
        System.out.println("1)Ingresar");
        System.out.println("2)Mostrar");
         System.out.println("3)Buscar");
        System.out.println("4)Salir");
        System.out.println("********************");
        System.out.println("Seleccione una opcion");
        op = sc.nextInt();
        
        switch (op) {
            case 1:
                sc.nextLine();
                System.out.println("Ingrese la marca");
                auto.setMarca(sc.nextLine());
                System.out.println("Ingrese el modelo");
                auto.setModelo(sc.nextLine());
                System.out.println("Ingrese el color");
                auto.setColor(sc.nextLine());
                auto.guardar();
                break;
            case 2: 
                auto.mostrar();
                break;
             case 3: 
                 sc.nextLine();
                 System.out.println("Ingrese la marca a buscar");
                 String m = sc.nextLine();
                 auto.buscar(m);
                break;    
            default:
                throw new AssertionError();
        }
        } while (op!=4);
        
    }
    
}
