/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    double galonesMaximo;
    double costoGalon;
    double iva;

    public double obtenerGalonesMaximo() {
        return galonesMaximo;
    }

    public void establecerGalonesMaximo(double c) {
        galonesMaximo = c;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public void establecerCostoGalon(double c) {
        costoGalon = c;
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva() {
          iva = (0.10 * costoGalon * galonesMaximo);
    }

    @Override
    public void calcularCancelar() {
     
        valorCancelar = costoGalon * galonesMaximo + iva;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("Datos Automovil Gasolina\n"
                + "Nombres: %s\n"
                + "Placa: %s\n"
                + "Costo Gasolina : %.2f\n",
                super.nombrePropietario,
                super.placa,
                super.valorCancelar);
        return cadena;
    }

}
