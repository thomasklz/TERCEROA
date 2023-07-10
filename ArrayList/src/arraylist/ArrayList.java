/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import clases.Auto;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Auto auto = new Auto();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre");
            auto.setNombre(sc.nextLine());
            System.out.println("Ingrese el color");
            auto.setColor(sc.nextLine());
            System.out.println("Ingrese el precio");
            auto.setPrecio(sc.nextLine());
            auto.guardar();
        }
        
        
        System.out.println("***************************");
        auto.mostrar();
    }
    
}
