/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opera1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Opera1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        Operaciones ope = new Operaciones();
        
        System.out.println("Ingrese el primer numero");
        ope.numero1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        ope.numero2= sc.nextInt();
        
        ope.suma();
        ope.resta();
        ope.multiplicacion();
    }
    
}
