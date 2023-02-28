/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author victorgrc723
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    
    public void prueba(){
        //CLASE DEL MISMO PAQUETE
        ClaseB objB = new ClaseB();
        //objB.defaultB;
        //objB.publicB;
        
        //CLASE DEL PAQUETE 2
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        
        //ClaseF objF = new ClaseF();
    }
}


class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
