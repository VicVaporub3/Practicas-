/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_alcance_3;

/**
 *
 * @author victorgrc723
 */
public class EVA1_14_ALCANCE_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v = 100;
        System.out.println(v);
        for (int i = 0; i < 10; i++) {
            //int v = 100;//no se puede porque ya esta declarada en el main
            System.out.println(v);//visible en todo el main
            System.out.println(i);
            if(i == 5){
                System.out.println(v);//visible en todo el main
            }
        }
            for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public static void Algo(int v){
        
    }
    public static void Algo2(int v){
        
    }
}
