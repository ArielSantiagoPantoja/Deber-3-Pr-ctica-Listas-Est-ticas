/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNumerosDivisibles1 {
    private final List<Integer> numeros;
    
    public ListaNumerosDivisibles1() {
        numeros = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }
    }
    
    public List<Integer> obtenerDivisibles(int divisor) {
        List<Integer> divisibles = new ArrayList<>();
        for (int num : numeros) {
            if (esDivisible(num, divisor)) {
                divisibles.add(num);
            }
        }
        return divisibles;
    }
    
    private boolean esDivisible(int num, int divisor) {
        return num % divisor == 0;
    }
    
  
}
