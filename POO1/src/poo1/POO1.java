/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coche coche = new Coche ();
    
        System.out.println("Ingrese el color");
        coche.color=sc.nextLine();
        
        System.out.println("Ingrese el modelo");
        coche.modelo=sc.nextLine();
        
        System.out.println("Ingrese la marca");
        coche.marca=sc.nextLine();
        
        
        System.out.println("INgrese el year");
        coche.year=sc.nextInt();
       
        coche.avanzar();
        System.out.println(coche.color + " "+ coche.modelo +" "+coche.year); 
        
        
        Coche coche1 = new Coche ();
        coche1.color="Rojo";
        coche1.modelo="kiko";
        coche1.year=2017;
        coche1.marca="Chavo";
        coche1.parar();
        System.out.println(coche1.color + " "+ coche1.modelo +" "+coche1.year); 
        
    }
    
}
