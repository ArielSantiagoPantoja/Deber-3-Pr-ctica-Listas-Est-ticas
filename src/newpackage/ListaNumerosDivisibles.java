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

public class ListaNumerosDivisibles {
  public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ListaNumerosDivisibles1 lista = new ListaNumerosDivisibles1();
        
        int divisor;
        do{
            System.out.println("-----Introduce un número entre 2 y 7: ");
            divisor = scanner.nextInt();
        } while (divisor < 2 || divisor > 7);
        
        List<Integer> divisibles = lista.obtenerDivisibles(divisor);
        
        System.out.println("Números divisibles por " + divisor + ": ");
        for (int num : divisibles) {
            System.out.print(num + " ");
        }
    }


}
/*public class ListaNumerosDivisibles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        
        // Llenala lista de números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            numeros.add(i);
        }
        
        // ingresa el usuario un número entre 2 y 7
        int divisor;
        do {
            System.out.println("Introduce un número entre 2 y 7: ");
            divisor = scanner.nextInt();
        } while (divisor < 2 || divisor > 7);
        
        //  muestra los números divisibles por el número introducido
        List<Integer> divisibles = new ArrayList<>();
        for (int num : numeros) {
            if (num % divisor == 0) {
                divisibles.add(num);
            }
        }
        
        System.out.println("Números divisibles por " + divisor + ": ");
        for (int num : divisibles) {
            System.out.print(num + " ");
        }
    }
}
*/