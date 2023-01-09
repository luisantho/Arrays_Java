/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author luibol
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int vector[] = new int[10];

        System.out.println("Contenido Vector:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50);
            System.out.println("" + vector[i]);
        }
        System.out.println("Elementos pares:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                System.out.println("" + vector[i] + ",posicion:" + i);

            }
        }

        System.out.println("Elementos impares:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 != 0) {
                System.out.println("" + vector[i] + ",posicion:" + i);

            }
        }
    }
}
