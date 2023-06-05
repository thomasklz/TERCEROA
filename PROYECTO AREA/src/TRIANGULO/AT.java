/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TRIANGULO;

/**
 *
 * @author USUARIO
 */
public class AT {
        public  int base,altura,area,bas,alt;
        public float areatri, arearec;
        public double areacir,radio;
   
        public void areacir () {
            areacir = 3.1416 * Math.pow (radio,2);
            System.out.println("El area del circulo es: " + areacir);
        }
        public void areatri () {
            areatri = (base * altura)/2;
            System.out.println("El area del triangulo es: " + areatri);
        }
        public void arearec () {
            arearec = bas * alt;
            System.out.println("El area del rectangulo es: " + arearec);
        }
    
}
