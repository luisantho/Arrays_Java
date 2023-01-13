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
public class Ejercicio5 {

    public static void main(String[] args) {

        int A[][] = new int[100][2];
        int B[][] = new int[50][2];
        int fila1[] = new int[100];
        int fila2[] = new int[50];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][0] = i + 1;
                A[i][j] = (int) (Math.random() * 10);

            }

        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][0] = i + 1;
                B[i][j] = (int) (Math.random() * 10);
            }

        }
        for (int i = 0; i < fila1.length; i++) {
            fila1[i] = A[i][0];
        }

        for (int i = 0; i < fila2.length; i++) {
            fila2[i] = B[i][0];

        }
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
               
            }
            
        }

    }

}
