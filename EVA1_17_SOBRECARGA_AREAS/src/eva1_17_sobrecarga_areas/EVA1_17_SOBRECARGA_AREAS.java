/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Circulo = " + calcularArea(5.0));
        System.out.println("Triangulo = " + calcularArea(5.0, 5.0));
        System.out.println("Trapecio = " + calcularArea(5.0, 5.0, 5.0));
        
    }
    public static double calcularArea(double radio){
    return Math.PI * radio * radio;
}
   public static double calcularArea(double base, double altura){
       return (base * altura) /2.0;
   }
      public static double calcularArea(double altura, double baseMay, double baseMen){
       return (altura * baseMay * baseMen);
      }
    
}
