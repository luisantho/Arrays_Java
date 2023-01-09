/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author luibol
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int vector[] = new int[50];
        int cont=0;
        int suma=0;

        System.out.println("Contenido Vector:");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50);
            System.out.println("" + vector[i]);
        }
        
        
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]%2==0){
            cont++;
            suma=suma+vector[i];
            
            }
        }
        System.out.println("Total numeros pares:"+cont);
        System.out.println("Suma total de pares:"+suma);
    }

}
