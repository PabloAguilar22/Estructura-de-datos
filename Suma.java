package com.mycompany.suma;

//Importación de librerías
import java.util.Scanner;

public class Suma {
    public static void main(String [] args) {
        
        //Declaración de variables
        float result;
        float a;
        float b;
        
        //Declaración del scanner para introducir datos
        Scanner scanner = new Scanner (System.in);
    
        //Ingreso de datos
        System.out.println("Ingresa el primer número: ");
        a = scanner.nextFloat();
        
        System.out.println("Ingresa el segundo número: ");
        b = scanner.nextFloat();
        
        //Operación
        result = a + b;
        
        //Resultado de la operación
        System.out.println("El resultado de la operación es: " + result);
    }
    
}
