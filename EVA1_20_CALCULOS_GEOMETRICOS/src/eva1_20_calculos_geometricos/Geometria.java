/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_calculos_geometricos;

/**
 *
 * @author victorgrc723
 */
public class Geometria {
    //constantes:
    public static final double PI = 3.1416;//final: un significado para las clases
    
    
    //perimetro de un circulo
    public static double perimetroCirculo(double radio){
        return PI * (radio * 2);  
    }
    //area de un circulo
    public static double areaCirculo(double radio){
        return PI * (radio * radio);
    }
    //volumen de una esfera
    public static double volumenEsfera(double radio){
        return (4.0 / 3.0) * (PI * (radio * radio * radio));
    }
    
}
