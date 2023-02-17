/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_circulo;

/**
 *
 * @author victorgrc723
 */
public class Circulo {
double radio,area,perimetro;
public Circulo(double rad1){
    this.radio=rad1;
}
public void areaCirc(){
    this.area=Math.PI*this.radio*this.radio;
    this.perimetro=2*Math.PI*this.radio*this.radio;
}
public double getRadio(){
    return radio;
}
public double getArea(){
    return area;
}
public double getPerimetro(){
    return perimetro;
}
public void setRadio(double valor){
    radio = valor;
}
public void setArea(double valor){
    area = valor;
}
public void setPerimetro(double valor){
    perimetro = valor;
}
        
    
}
