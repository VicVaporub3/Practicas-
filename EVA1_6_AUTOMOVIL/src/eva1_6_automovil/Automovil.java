/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_automovil;

/**
 *
 * @author victorgrc723
 */
public class Automovil {
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;


    

    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public int getAño() {
        return año;
    }

    public String getDueño() {
        return dueño;
    }

    public void setMarca(String valor) {
        marca = valor;
    }

    public void setmodelo(String valor) {
        modelo = valor;
    }

    public void setPlacas(String valor) {
        placas = valor;
    }

    public void setAño(int valor) {
        año = valor;
    }

    public void setDueño(String valor) {
        dueño = valor;
    }
    //Calcular la revalidación

    public int calcularRev() {
        int adeudo = 0;
        if (año < 2000) {
            adeudo = 1500;
        } else if ((año >= 2001) && (año <= 2005)) {
            adeudo = 2000;
        } else if ((año >= 2006) && (año <= 2010)) {
            adeudo = 2500;
        } else if ((año >= 2011) && (año <= 2015)) {
            adeudo = 3000;
        } else {
            adeudo = 3500;
        }
        return adeudo;
    }

    public void imprimirDatos() {
        System.out.println("DATOS DEL AUTOMOVIL: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placas);
        System.out.println("Año: " + año);
        System.out.println("Nombre del dueño: " + dueño);
        //llamamos al método calcular revalidacion
        System.out.println("Adeudo: " + calcularRev());

}
}