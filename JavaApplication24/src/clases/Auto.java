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
   private  String marca, modelo,color;
   ArrayList<Auto> arrayAuto = new ArrayList();
   
    public Auto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Auto() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
    public void guardar(){
        arrayAuto.add(new Auto(getMarca(), getModelo(),getColor()));
    }
    
    public void mostrar(){
        for (int i = 0; i < arrayAuto.size(); i++) {
            System.out.println("Marca: "+ arrayAuto.get(i).getMarca());
            System.out.println("Modelo: "+ arrayAuto.get(i).getModelo());
            System.out.println("Color: "+ arrayAuto.get(i).getColor());
        }
    }
    
    
    public void buscar(String dataBuscar){
        for (int i = 0; i < arrayAuto.size(); i++) {
            if(arrayAuto.get(i).getMarca().equals(dataBuscar)){
                
                System.out.println("Dato encontrado en la [posicion: "+ i );
                //System.out.println("Dato encontrado");
            }
        }
        
    }
   
    
}
