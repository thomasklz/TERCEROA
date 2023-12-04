/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opera1;

/**
 *
 * @author USUARIO
 */
public class Operaciones {
    
    int numero1, numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operaciones() {
    }
    
    
    
    
    public void suma(){
        System.out.println("La suma es:"+ (numero1+numero2));
    }
    public void resta(){
        System.out.println("La resta es:"+ (numero1-numero2));
    }
    public void multiplicacion(){
        System.out.println("La multiplciacion es:"+ (numero1*numero2));
    }
}
