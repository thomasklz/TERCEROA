/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personas;

import Clases.Datos;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        Datos da = new Datos ();
        
        System.out.println("Ingrese el nombre de la persona");
        da.nombre=sc.nextLine();
        System.out.println("Ingrese el genero de la persona");
        da.sexo=sc.nextLine();
        System.out.println("Ingrese la cedula de la persona");
        da.cedula=sc.nextLine();
        System.out.println("Ingrese la edad de la persona");
        da.edad=sc.nextInt();
        System.out.println("Ingrese el peso de la persona");
        da.peso=sc.nextFloat();
        System.out.println("Ingrese la altura de la persona");
        da.altura=sc.nextFloat();
        da.ingresarPersonas();
        sc.nextLine();
        da.mayor();
        
        System.out.println("ingrese el numero de cedula a buscar");
        da.buscar=sc.nextLine();
        da.buscarpersona();
       
    }
    
}
