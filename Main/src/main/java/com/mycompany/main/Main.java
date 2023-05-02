/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author lucho
 */
public class Main {
    // Declaración y prototipo de función
    public static int suma(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int x = 5, y = 3, resultado;
        
        // Llamada a la función
        resultado = suma(x, y);
        
        System.out.println("La suma es " + resultado);
    }
}
