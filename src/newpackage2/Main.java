/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

import static newpackage2.Persona.calcularPromedioEdades;
import static newpackage2.Persona.capturarPersonas;
import static newpackage2.Persona.contarGenero;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Persona[] personas = capturarPersonas();

        System.out.println("El promedio de edades es: " + calcularPromedioEdades(personas));
        System.out.println("Cantidad de personas masculinas: " + contarGenero(personas, "Masculino"));
        System.out.println("Cantidad de personas femeninas: " + contarGenero(personas, "Femenino"));
    }
}
