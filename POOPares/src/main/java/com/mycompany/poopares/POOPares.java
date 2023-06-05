/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poopares;

import Clases.Numeros;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOPares {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       Numeros n = new Numeros();
       
        System.out.println("Ingrese el numero limite del for");
        n.numero=sc.nextInt();
        n.imprimir(n.numero);
       
     
    }
}
