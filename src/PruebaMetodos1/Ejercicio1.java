/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos1;
import java.util.Arrays;

/**
 *
 * @author luibol
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int matriz[] = new int[10];

        for (int i = 0; i < matriz.length; i++) {

            matriz[i] = (int) (Math.random() * 20);

        }
        System.out.println("Conenido vector:");
        mostrarArrayPantalla2(matriz);

    }

    public static void mostrarArrayPantalla2(int a[]) {
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]+",");
            System.out.print("");

        }

    }

}

