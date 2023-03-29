/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author invitado
 */
public class EVA2_21_POLIMORFISMO_VEHICULOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil("Mazda", "Mazda 3", 2022, 2022);
        
        
    }
    
}
class Vehiculo{
    private String Marca;
    protected int velocidad;

    public Vehiculo(String Marca, int velocidad) {
        this.Marca = Marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
interface ControlarDatos{
    void cambiarVelocidad(int cambio);
    public abstract void tablero();
}
class Automovil extends Vehiculo{
    private String modelo;
    private int año;
    private final String marca;

    public Automovil (String marca, int velocidad, String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
class Bicicleta extends Vehiculo implements ControlarDatos{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(String Marca, int velocidad) {
        super(Marca, velocidad);
    }

    @Override
    public void cambiarVelocidad(int cambio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tablero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

