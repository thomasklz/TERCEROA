/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pooclases;

import Clases.Coche;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOClases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coche co = new Coche();
        
        System.out.println("Ingrese la marca");
        co.marca = sc.nextLine();
        
        
       // co.modelo = "xw";
       // co.color = "Negro mate";
       // co.year = 2025;
        
        
       // co.encerder();
        co.apagar();
        
    }
}
