/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_return;

/**
 *
 * @author victorgrc723
 */
public class EVA1_10_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        square(10);//llamada a funcion, pero sin procesar el resultado
        int resu;
        resu = square(3);//llamada a funcion, almacenando el resultado
        System.out.println(resu);
        System.out.println(square(5));//llamada a funcion, enviando el resultado
    }
    public static int square(int num){
        return num * num;
    }
    
}
