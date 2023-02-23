/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_califas;

/**
 *
 * @author victorgrc723
 */
public class EVA1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String resul;
        resul = convertirCalf(100);
        System.out.println(resul);
        System.out.println(convertirCalf(80));
        
    }
    public static String convertirCalf(int score){
        String resu = "";
        if ((score >=91) && (score <=100)){
            resu = "A";
        }else if((score >=81) && (score<=90)){
            resu = "B";
        }else if((score >=71) && (score<=80)){
            resu = "C";
        }else{
            resu = "D";
        }
        return resu;

           
    }
    
}
