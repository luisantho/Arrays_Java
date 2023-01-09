/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author luibol
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        int vector[] = new int[20];
        int mayor = vector[0];
        boolean encontrado=false;

        System.out.println("Contenido Vector:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50);
            System.out.println("" + vector[i]);
        }
        System.out.println("");
        System.out.println("Elemento mayor:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor && !encontrado) {
                mayor = vector[i];
                System.out.println("" + mayor + ",posicion:" + i);
            }
        }
    }

}
