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
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        //TODAS ESTAS CLASES ESTAN EN PAQUETE 1
        //MISMO PAQUETE, PUBLIC Y DEFAULT SON VISIBLES 
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        
        
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC;  
        
        
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        
        //CLASES DEL PAQUETE2
        //TODO LO QUE SEA DEFAULT AHORA ES INVISIBLE
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF ---> ES DEFAULT, Y NO ES VISIBLE EN OTRO PAQUETE 
        //ClaseF objF = new ClaseF();
    }
}


class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
    
    
    public void prueba(){
        //TODAS ESTAS CLASES ESTAN EN PAQUETE 1
        //MISMO PAQUETE, PUBLIC Y DEFAULT SON VISIBLES 
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        
        
        ClaseC objC = new ClaseC();
        //objC.defaultC;
        //objC.publicC;  
        
        
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        
        //CLASES DEL PAQUETE2
        //TODO LO QUE SEA DEFAULT AHORA ES INVISIBLE
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF ---> ES DEFAULT, Y NO ES VISIBLE EN OTRO PAQUETE 
        //ClaseF objF = new ClaseF();
    }
}
