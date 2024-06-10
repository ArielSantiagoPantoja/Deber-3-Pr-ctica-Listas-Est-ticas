/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Persona {
     private final String nombre;
    private final String apellido;
    private final String genero;
    private final int edad;

    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    public static Persona[] capturarPersonas() {
        Persona[] personas = new Persona[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
            String nombre = scanner.next();
            System.out.println("Ingrese el apellido de la persona " + (i + 1) + ":");
            String apellido = scanner.next();
            System.out.println("Ingrese el género de la persona " + (i + 1) + " (Masculino/Femenino):");
            String genero = scanner.next();
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            int edad = scanner.nextInt();
            personas[i] = new Persona(nombre, apellido, genero, edad);
        }

        return personas;
    }

    public static double calcularPromedioEdades(Persona[] personas) {
        int sumaEdades = 0;
        for (Persona persona : personas) {
            sumaEdades += persona.edad;
        }
        return (double) sumaEdades / personas.length;
    }

    public static int contarGenero(Persona[] personas, String generoBuscado) {
        int contador = 0;
        for (Persona persona : personas) {
            if (persona.genero.equalsIgnoreCase(generoBuscado)) {
                contador++;
            }
        }
        return contador;
    }
}
