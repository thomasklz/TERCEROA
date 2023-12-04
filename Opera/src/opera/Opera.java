/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opera;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Opera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      Operaciones opera = new Operaciones();
     
     
      
      System.out.println("Ingrese el  primer numero");
      opera.numero1= sc.nextInt();
      
      System.out.println("Ingrese el segundo numero");
      opera.numero2= sc.nextInt();
         
      opera.suma();
      
      
      
      
      
      
    }
    
}
