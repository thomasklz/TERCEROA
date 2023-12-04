/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraynumeros;

/**
 *
 * @author USUARIO
 */
public class ArrayNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int[] numero = new int[100];
        int suma=0;
        for (int i = 0; i < 100; i++) {
            numero[i]=i+1;
        }
        
        
        for (int i = 0; i < 100; i++) {
            System.out.println(numero[i]);   
            suma+= numero[i];
        }

        System.out.println("La suma es: "+ suma);

    }
  
}
