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
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int[] vector = new int[10];
        
        System.out.println("Contenido del vector:");
        completarArray3(vector);
        System.out.println(Arrays.toString(vector));
        
    }
    
    public static void completarArray3(int[] a) {
        
        for (int i = 0, num = 0; i < a.length; i++, num += 2) {
            a[i] = num;
        }
        
    }
    
}
