/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Vector {
    public int v;
    public int [] numeros ;
    
    public void guardar(int indice, int valor){
     numeros[indice]=valor;
    }
    public void mostrar(){
        for (int i = 0; i < v; i++) {
            System.out.println("El valor en la posicion "+ i + " es "+ numeros[i]);
        }
    
    }
    public boolean buscar(int numero){
        boolean estado=false;
        for (int i = 0; i < v; i++) {
             if(numeros[i]== numero){
                 estado=true;
             }
        }
        
         if(estado==true){
            System.out.println("Numero encontrado");
        }else{
            System.out.println("Numero no encontrado");
        }
        
  
        return estado;
    }
    
}
