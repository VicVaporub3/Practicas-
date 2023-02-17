/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

import java.util.Scanner;

/**
 *
 * @author victorgrc723
 */
public class EVA1_5_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r;
        Scanner radios=new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo a calcular el area y perimetro de la circunferencia");
        r=radios.nextDouble();
        Circulo circ = new Circulo(r);
        circ.areaCirc();
        System.out.println("El area del circulo con radio" +r+ "es" +circ.area+ "\n y el perimetro de la circunfrencia es" +circ.perimetro);
        



    }
    
}
