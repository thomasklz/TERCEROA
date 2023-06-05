/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poobanco;

import Clases.cuenta;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      cuenta c = new cuenta();  
       int op;
        System.out.println("Ingrese su nombre");
        c.nombre= sc.nextLine();
        System.out.println("Ingrese su numero de cuenta");
        c.num_cuenta= sc.nextLine();
        System.out.println("Ingrese su numero de cedula"); 
        c.cedula= sc.nextLine();
        
        do {   
            System.out.println("Bienvenido al banco");
            System.out.println("1) Retiro");
            System.out.println("2) Deposito");
            System.out.println("3) Salir");
            System.out.println("Seleccione una opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese la cantidad a retirar");
                    double ret= sc.nextDouble();
                    c.retiro(ret);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar");
                    double dep= sc.nextDouble();
                    c.deposito(dep);
                    break;   
            }
        } while (op!=3);
        
       
        
    }
    
}
