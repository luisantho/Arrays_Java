/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos1;

/**
 *
 * @author luibol
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int vector[] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50);
        }
        String resultado = obtenerArrayComoString(vector);
        System.out.println(resultado);

    }

    public static String obtenerArrayComoString(int a[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(",");

            }

        }

        return sb.toString();
    }

}
