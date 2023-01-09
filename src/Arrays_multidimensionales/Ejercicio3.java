/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_multidimensionales;
import java.util.Arrays;

/**
 *
 * @author luibol
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int V[] = new int[50];
        int P[] = new int[20];
        int M[][] = new int[50][20];

        //Rellenamos los dos vectores con numeros random
        for (int i = 0; i < V.length; i++) {
            V[i] = (int) (Math.random() * 10);

        }

        for (int i = 0; i < P.length; i++) {
            P[i] = (int) (Math.random() * 10);

        }

        //Recorremos la matriz y lo rellenamos con los vectores
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = V[i] * P[j];
                System.out.print(M[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
