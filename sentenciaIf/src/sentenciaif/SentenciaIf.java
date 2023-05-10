/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sentenciaif;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class SentenciaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
 Crea un programa que pida al usuario ingresar su edad y 
determine si es un niño
(menor de 12 años), adolescente (entre 12 y 18 años) o adulto (mayor de 18
años). */

       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        short edad= entrada.nextShort();
        
        
        if(edad<12){
            System.out.println("Es un nino");
        }else if(edad>=12 && edad<18){
            System.out.println("Es adolecente");
        }else{
            System.out.println("Adulto");
        }
        
       
    }
}
