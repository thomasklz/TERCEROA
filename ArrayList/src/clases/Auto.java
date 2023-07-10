/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Auto {
   private String nombre, color, precio; 
   ArrayList<Auto> arrayAuto= new ArrayList();
   
    public  Auto(String _nombre, String _color, String _precio){
     this.nombre=_nombre;
     this.color=_color;
     this.precio=_precio;
    }
    
    public Auto(){}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
   
   
    public void guardar(){
        this.arrayAuto.add(new Auto(getNombre(), getColor(),getPrecio()));
    }
    
    public void mostrar(){
    
        for (int i = 0; i < arrayAuto.size(); i++) {
            
            System.out.println("************ " + i + " ***********");
            System.out.println("Nombre: "+ arrayAuto.get(i).getNombre());
            System.out.println("Color: "+ arrayAuto.get(i).getColor());
            System.out.println("Precio: "+ arrayAuto.get(i).getPrecio());
            System.out.println("************ FIN ***********");
        }
    }
}
