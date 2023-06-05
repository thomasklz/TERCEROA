/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class cuenta {
   public String nombre, num_cuenta, cedula;
   public double monto=25000;
   
   public void deposito(double valor_deposito){
       monto += valor_deposito;
       System.out.println("Su monto actual es: "+ monto);
   }
    public void retiro(double valor_retiro){
       if(valor_retiro > monto){
           System.out.println("Valor insuficiente");
           System.out.println("Su monto actual es: "+ monto);
       } else{
            monto -= valor_retiro;
            System.out.println("Su monto actual es: "+ monto);
       }
   }
}
