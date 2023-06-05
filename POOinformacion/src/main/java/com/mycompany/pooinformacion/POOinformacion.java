/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pooinformacion;

import Clases.Persona;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOinformacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        
        System.out.println("Ingresa el nombre");
        p.nombre=sc.nextLine();
        System.out.println("Ingrese el signo");
        p.signo=sc.nextLine();
        System.out.println("Ingrese el hobbit");
        p.hobbit=sc.nextLine();
        System.out.println("Ingrese tu edad");
        p.edad=sc.nextInt();
        
        p.info();
    }
}
