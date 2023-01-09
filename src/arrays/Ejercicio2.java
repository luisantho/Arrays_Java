/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author luibol
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int vector[] = new int[10];
        
        System.out.println("Contenido Vector:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50);
            System.out.println("" + vector[i]);
        }

        System.out.println("Posicion par:");
        for (int i = 0; i < vector.length; i++) {

            if (i % 2 == 0) {
                System.out.println("" + vector[i]);
            }

        }

        System.out.println("Posicion impar:");
        for (int i = 0; i < vector.length; i++) {

            if (i % 2 != 0) {
                System.out.println("" + vector[i]);
            }
        }

    }
}
