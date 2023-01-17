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
public class Ejercicio4 {
    public static void main(String[] args) {
     int orden=5;  
     int[][] matriz=new int[orden][orden];
     
    
     
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i==0){
                    matriz[i][j]=j+1;
                }else{
                    if(j==0){
                    matriz[i][j]=matriz[i-1][matriz[i].length-1];
                    }else{
                        matriz[i][j]=matriz[i-1][j-1];
                    }
                }
            }
            
           }
        System.out.println("Contenido Matriz:  ");
        for (int[] cLatino1: matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" | ");
                System.out.print(cLatino1[j]);
                System.out.print(" | ");
                
            }
            System.out.println();
            
        }
        
    }
        
        
        
    }
