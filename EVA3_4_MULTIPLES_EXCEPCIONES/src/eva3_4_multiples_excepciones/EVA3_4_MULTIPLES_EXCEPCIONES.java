/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int x, y;
        do{
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor de x (numero entero):");
        x = input.nextInt();
        System.out.println("Introduce el valor de y (numero entero):");
        y = input.nextInt();
        int resu = x / y;
        System.out.println("Resultado de " + x + "/" + y + " : " + resu);
        System.out.println("Programa terminado exitosamente");
        break;
    }catch(InputMismatchException e){
            System.out.println("Captura en formato incorrecto, no se puede convertir a numero");
    }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre cero");
    }
        }while(true);
        System.out.println("PROGRAMA TERMINADO");
    }
    
}
