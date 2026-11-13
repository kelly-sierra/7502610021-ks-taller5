
package taller5.pruebaexterna;

import taller5.vehiculos.Vehiculo;
import taller5.vehiculos.Moto;

public class PruebaVehiculo {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Carro");

        Moto moto = new Moto("Deportiva");

        System.out.println("Vehículo creado correctamente");

        moto.mostrarTipo();

        // Estas instrucciones producen errores:
        // System.out.println(vehiculo.tipo);
        // System.out.println(moto.tipo);
    }
}