/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class Datos {
    public String nombre, sexo, cedula, buscar;
    public int edad;
    public float peso, altura;
    
    
    public void ingresarPersonas(){
        System.out.println("El nombre de la persona es: "+nombre);
        System.out.println("El genero de la persona es: "+sexo);
        System.out.println("La cedula de la persona es: "+cedula);
        System.out.println("La edad de la persona es: "+edad);
        System.out.println("El peso de la persona es: "+peso);
        System.out.println("La altura de la persona es: "+altura);
        
        
    }
    
    public void mayor(){
        if (edad>=18) {
            System.out.println("es mayor de edad"+edad);
            
        }
        else {
            System.out.println("es menor de edad"+edad);
        }
    }
    
    public void buscarpersona(){
        if(buscar.equals(cedula)){
         System.out.println("El nombre de la persona es: "+nombre);
        System.out.println("El genero de la persona es: "+sexo);
        System.out.println("La cedula de la persona es: "+cedula);
        System.out.println("La edad de la persona es: "+edad);
        System.out.println("El peso de la persona es: "+peso);
        System.out.println("La altura de la persona es: "+altura);
        }
        else{
            System.out.println("NO SE ENCONTRO EL USUARIO");
        } 
    }
}
