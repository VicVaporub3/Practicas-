/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursoprogramacion;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class ConcursoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n=0; 
        n=input.nextInt();
        
       double rspt = (Math.pow((3+ Math.sqrt (5)),n));
         System.out.println("El resultado de la operación es: " + rspt) ;
       while(rspt>1000){
           rspt-=1000;
        }
       System.out.println("Los tres digitos antes del punto en el resultado de la operación son: " + rspt );
        
                    }
            
        }
        
               
      

    
