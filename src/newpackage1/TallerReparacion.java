/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */

public class TallerReparacion {
    private final List<Coche> coches;

    public TallerReparacion() {
        coches = new ArrayList<>();
    }

    public void entradaNuevoCoche(String propietario, String matricula, String marca) {
        Coche coche = new Coche(propietario, matricula, marca);
        coches.add(coche);
        System.out.println("Coche registrado en el taller.");
    }

    public void salidaCocheReparado(String propietario) {
        for (Coche coche : coches) {
            if (coche.getPropietario().equalsIgnoreCase(propietario)) {
                coche.setReparado(true);
                System.out.println("Coche reparado y entregado.");
                return;
            }
        }
        System.out.println("Coche no encontrado en el taller.");
    }

    public void listarVehiculos() {
        System.out.println("Listado de vehículos en el taller:");
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}