/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author luibol
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int vector[] = new int[50];
        boolean encontrado = false;

        System.out.println("Contenido Vector:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.println("" + vector[i]);
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 0 && !encontrado) {

                System.out.println("Primer elemento cero encontrado en la posicion:" + i);
                encontrado = true;
            }

        }
        if (!encontrado) {
            System.out.println("No se ha encontrado ningun elemento cero");

        }

    }
}
