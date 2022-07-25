/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombresPropietario;
        String placa;
        double numGalones;
        double costoGa;
        int tipoAutomovil;
        String continuar;

        ArrayList<Automovil> automovil = new ArrayList<>();

        // inicio de solución
        boolean bandera = true;

        while (bandera) {
            System.out.println("Tipo de Automovil ingresar\n"
                    + "Ingrese (1) para Automovil Gasolina\n"
                    + "Ingrese (2) para Automovil Diesel");
            tipoAutomovil = entrada.nextInt();
            if (tipoAutomovil > 2 || tipoAutomovil < 1) {
                break;
            }
            entrada.nextLine();
            System.out.println("Ingrese los nombres del Propietario");
            nombresPropietario = entrada.nextLine();

            System.out.println("Ingrese la Placa");
            placa = entrada.nextLine();

            if (tipoAutomovil == 1) {
                AutomovilGasolina automovilG = new AutomovilGasolina();
                System.out.println("Ingrese el numero de galones");
                numGalones = entrada.nextDouble();
                System.out.println("Ingrese el costo galon");
                costoGa = entrada.nextDouble();
                automovilG.establecerGalonesMaximo(numGalones);
                automovilG.establecerCostoGalon(costoGa);
                automovilG.establecerNombrePropietario(nombresPropietario);
                automovilG.setPlaca(placa);
                automovilG.establecerIva();
                automovil.add(automovilG);

            } else {
                AutomovilDiesel autoD = new AutomovilDiesel();
                System.out.println("Ingrese el número de litros");
                numGalones = entrada.nextInt();
                System.out.println("Ingrese el costo de cada litro");
                costoGa = entrada.nextDouble();
                autoD.establecerNombrePropietario(nombresPropietario);
                autoD.setPlaca(placa);

                autoD.establecerCostoLitro(costoGa);
                autoD.setLitrosMaximos(numGalones);
                autoD.establecerDescuento();
                automovil.add(autoD);
            }
            entrada.nextLine();
            System.out.println("Ingrese SI para ingresar otro automovil\n"
                    + "Ingrese NO para mostrar reporte:");
            continuar = entrada.nextLine();

            bandera = continuar.equals("SI") || continuar.equals("si");
        }
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < automovil.size(); i++) {
            // 1.  
            automovil.get(i).calcularCancelar();

            System.out.printf("Datos Automovil\n"
                    + "%s\n",
                    automovil.get(i));

        }
    }

    // ciclo que permite comprobar el polimorfismo
    // este código no debe ser modificado.
}
