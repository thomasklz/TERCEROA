/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.area;

import TRIANGULO.AT;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PROYECTOAREA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        AT c=new AT();
       
       System.out.println("ingrese el radio");
       c.radio=sc.nextDouble();
       c.areacir();
        
       System.out.println("--------------------------------------------------------------------");
        
        
        System.out.println("ingrese la base del triangulo");
        c.base=sc.nextInt();
        System.out.println("ingrese la altura del triangulo");
        c.altura=sc.nextInt();
        c.areatri();
        
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println("ingrese la bas del rectangulo");
        c.bas=sc.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        c.alt=sc.nextInt();
        c.arearec();
    }
    
}
