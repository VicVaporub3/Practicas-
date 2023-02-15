/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_television;

/**
 *
 * @author victorgrc723
 */
public class Television { 
    private boolean power;
    private int volumen;
    private int canal;
    //metodos: comportamiento
    
    
    public Television(){ //constructor default
        power = false; //apagado
        volumen = 0;
        canal = 2;
    }
   
    public void OnOff(){
        if(power == false){ //De apagado a encendido
            power=true;
            System.out.println("Tv encendida");
        }
        else{
            power = false; //De encendido a apagado
            System.out.println("Tv apagada");
    
        }
    }
    public void VolumeUp(){
        
        if(power == true){
            if(volumen < 100){
            if(volumen<100){
            volumen +=5;
            }
        System.out.println("Volumen: "+ volumen);
        }
        }
    }
     public void VolumeDown(){
        if(power == true){
            if(volumen > 0){
            if(volumen>0){
            volumen -=5;
            }
        System.out.println("Volumen: "+ volumen);
        }
        }
     }
     public void CanaUp(){
         if (power == true){
             if(canal < 100){
             canal = canal + 1;
             System.out.println("Canal: " + canal);
                 
             }else{
                 canal = 0;
             }


         }
     }
     public void CanaDown(){
         if (power == true){
             if(canal > 0){
             canal = canal - 1;
             System.out.println("Canal: " + canal);
            
             }else{
                 canal = 100;
             }
             
         }

     }
     
     }