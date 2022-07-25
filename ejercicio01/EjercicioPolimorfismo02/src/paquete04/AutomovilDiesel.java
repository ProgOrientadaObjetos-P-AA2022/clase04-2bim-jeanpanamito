/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    double litrosMaximos;
    double costoLitro;
    double descuento;

    public double obtenerLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(double c) {
      litrosMaximos = c;
    }

    public double obtenerCostoLitro() {
        return costoLitro;
    }

    public void establecerCostoLitro(double c) {
       costoLitro = c;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public void establecerDescuento() {
        descuento = (litrosMaximos*0.05);
    }
    
    @Override
    public void calcularCancelar() {
        valorCancelar= (costoLitro*descuento);
    }
 @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("Datos Automovil Diesel\n"
                + "Nombres: %s\n"
                + "Placa: %s\n"
                + "Costo Gasolina : %.2f\n",
                super.nombrePropietario,
                super.placa,
                super.valorCancelar);
        return cadena;
    }
}