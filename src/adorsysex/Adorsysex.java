/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adorsysex;

import java.util.Scanner;

/**
 *
 * @author SAID
 */
public class Adorsysex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nombre;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez un nombre pour calculer sa factorielle : ");
            nombre = scanner.nextInt();
        }
        
        int resultat = calculerFactorielle(nombre);
        System.out.println("La factorielle de " + nombre + " est : " + resultat);
    }

    public static int calculerFactorielle(int n) {
        if (n == 0) {
            return 1; // La factorielle de 0 est 1
        } else {
            return n * calculerFactorielle(n - 1);
        }
    }
    
}
