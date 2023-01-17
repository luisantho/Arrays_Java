/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos1;

/**
 *
 * @author luibol
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        int vector[] = new int[10];
        
        System.out.println("Contenido Vector:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            System.out.println("" + vector[i]);
        }
        
        System.out.println("Suma de los elementos:");
        System.out.println("" + obtenerSumaArray(vector));
    }
    
    public static int obtenerSumaArray(int a[]) {
        
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            
            suma += a[i];
        }
        
        return suma;
    }
}
