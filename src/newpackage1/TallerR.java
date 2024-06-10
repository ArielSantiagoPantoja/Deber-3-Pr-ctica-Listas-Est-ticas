/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TallerR{
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TallerReparacion taller = new TallerReparacion();

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1.- Entrada nueva reparación");
            System.out.println("2.- Salida de coche reparado");
            System.out.println("3.- Listado de vehículos");
            System.out.println("4.- Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del propietario:");
                    String propietario = scanner.next();
                    System.out.println("Introduce la matrícula:");
                    String matricula = scanner.next();
                    System.out.println("Introduce la marca:");
                    String marca = scanner.next();
                    taller.entradaNuevoCoche(propietario, matricula, marca);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del propietario:");
                    String nombreBuscar = scanner.next();
                    taller.salidaCocheReparado(nombreBuscar);
                    break;
                case 3:
                    taller.listarVehiculos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
