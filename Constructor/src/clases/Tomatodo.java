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
public class Tomatodo {
  private String color, marca;
  private int tamano;
  ArrayList<Tomatodo> arrayTomatodo = new ArrayList();
    public Tomatodo(String color, String marca) {
        this.color = color;
        this.marca = marca;
        
    }

    public Tomatodo() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "El color es: " + color + ", la marca es: " + marca + ",el tamano es: " + tamano + '}';
    }

    
    
  
}
