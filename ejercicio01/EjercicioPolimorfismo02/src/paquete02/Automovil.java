/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {
    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;   

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public void establecerNombrePropietario(String nombre) {
        nombrePropietario = nombre;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public void setPlaca(String pla) {
        placa = pla;
    }

    public abstract void calcularCancelar() ;
        
    

    
    
}
