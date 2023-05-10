/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingres el nombre de la fruta");
        String fruta= entrada.nextLine();
        
         switch (fruta) {
            case "mango":
                System.out.println("Precio: $0.50");
                break;
            case "pera":
                System.out.println("Precio: $0.35");
                break;    
            default:
                System.out.println("No tenemos en stock");
        }
        
    }
    
}
