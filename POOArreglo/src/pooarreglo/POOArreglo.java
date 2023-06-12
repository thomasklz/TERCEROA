/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooarreglo;

import clases.vector;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        vector v= new vector();
        int valor,ind, numero;
        System.out.println("Ingrese el indice del vector");
        ind= sc.nextInt();
        System.out.println("***** IMPRIMIR GUARDAR *******");
        for (int j = 0; j < ind; j++) {
            System.out.println("Ingrese un valor en la posicicion: " + j);
            valor = sc.nextInt();
            v.guardarValores(valor, j);
        }
        System.out.println("***** IMPRIMIR VALORES *******");
        v.imprimir();
        System.out.println("***** BUSCAR VALORES *******");
        System.out.println("Ingrese el numero a buscar");
        numero= sc.nextInt();
       boolean estado = v.buscarValor(numero);
       if(estado==true){
         System.out.println("El numero: "+  numero + " fue encontrado");
       }else{
           System.out.println("Numero no encontrado");
       }
       
       
    }
    
}
