/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class vector {
    int[] vector = new int [5];
    public void guardarValores(int valor, int indice){
            vector[indice]=valor;
    }
    
    public void imprimir(){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
    
    public boolean buscarValor(int valor){
        boolean estado=false;
        for (int i = 0; i < vector.length; i++) {
           if(valor==vector[i]){
               estado=true;
           }
        }
        return estado;
    }
}
