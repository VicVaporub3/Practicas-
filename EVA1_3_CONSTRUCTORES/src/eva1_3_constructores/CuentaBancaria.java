/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author victorgrc723
 */
public class CuentaBancaria {
    private String nomCliente;
    private String noCuenta;
    private double saldo;
    
    //CONSTRUCTOR:
    //MODIFICADOR DE ACCESO NOMRE DE LA CLASE (ARGUMENTOS)
    public CuentaBancaria(){//CONSTRUCTOR DEFAULT
        noCuenta = "";
        saldo = 0;
        nomCliente = "";
        
    }
    public CuentaBancaria(String nCuenta, double cant, String nCliente){//cant = cantidad = saldo
        noCuenta = nCuenta;
        saldo = cant;
        nomCliente = nCliente;
        
    }
    
    //metodos get y set
    public String getNoCuenta(){
        return noCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNomCliente(){
        return nomCliente;
    }
    public void setNoCuenta(String valor){
        noCuenta = valor;
    }
    public void setSaldo(double valor){
        saldo = valor;
    }
    public void setNomCliente(String valor){
        nomCliente = valor;
    }
}
