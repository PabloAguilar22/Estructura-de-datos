/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

/**
 *
 * @author pablo
 */

import java.util.Scanner;


public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //Se ocupa para guardar el ingreso de datos
        System.out.println("Ingresa el primer número: ");
        float a = scanner.nextFloat();
        
        
        System.out.println("Ingresa el segundo número: ");
        float b = scanner.nextFloat();
        
        //Declaración de variables de la calculadora simple
        float suma;
        float resta;
        float mult;
        float div;
        
        //Operaciones
        suma = a + b;
        resta = a - b;
        mult = a*b;
        div = a/b;
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + mult);
        System.out.println("El resultado de la división es: " + div);
        
    }
}
