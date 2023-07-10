/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

import clases.Tomatodo;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      
        Tomatodo toma = new Tomatodo();
      
        System.out.println("Tamano");
        toma.setTamano(sc.nextInt());
        
        sc.nextLine();
        System.out.println("Color");
        toma.setColor(sc.nextLine());
        
        System.out.println("Marca");
        toma.setMarca(sc.nextLine());
        
     
        
       
                
    }
    
}
