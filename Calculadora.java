package com.mycompany.calculadora;
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
        
        //Excepción con la divisió, se debe cuidar que el denominador sea diferente a 0
        if(b == 0){
            div = a/b;
            System.out.println("Error por división con 0");
        } else{
            div = a/b;
            System.out.println("El resultado de la división es: " + div);
        }
        
        
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicación es: " + mult);
        
        //Excepción con la divisió, se debe cuidar que el denominador sea diferente a 0
        if(b == 0){
            div = a/b;
            System.out.println("Error por división con 0");
        } else{
            div = a/b;
            System.out.println("El resultado de la división es: " + div);
        }
    }
}
