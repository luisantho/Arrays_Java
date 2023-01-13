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
public class EJercicio2 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[7][5];
        int matriz_dos[][] = new int[7][7];
        int suma = 0;

        //Introduce una matriz de 7 x 5 y visualízala
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 30);
            }
            
        }
        
        System.out.println("Contenido de la matriz 7x5:");
        System.out.println(Arrays.deepToString(matriz));

        //Crea una nueva matriz de 7 x 7 en donde las cinco primeras columnas sean las de la matriz origen
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[4].length; j++) {
                matriz_dos[i][j] = matriz[i][j];
            }
        }
        System.out.println("Contenido de la matriz 7x7");
       System.out.println(Arrays.deepToString(matriz_dos));
       
       //Guarda en la columna sexta la suma de las cinco anteriores
      
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz_dos[i][j];
                
            }
            
        }
        
        //System.out.println(Arrays.deepToString(matriz_dos));
        
        
     
    }
    
}
