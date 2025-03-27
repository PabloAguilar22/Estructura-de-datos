
package com.mycompany.calculadora2;
import java.util.Scanner;

public class Calculadora2 {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);    
        
        //Operaciones
        float suma;
        float resta;
        float mult;
        float div;
        
        //Menú de opciones
        System.out.println("Elija una opción:\n"
                + "1. 2 parámetros \n"
                + "2. 0 parámetros \n"
                + "3. 3 parámetros \n"
                + "4. Salir del programa");        
        
        int opcion = scanner.nextInt();
        
        //En lugar de ocupar muchos if, podemos ocupar solamente un caso para cada opción,
        switch(opcion){
            
            //Método con 2 parámetros
            case 1: 
                System.out.print("Ingresa tu primer número: ");
                float a = scanner.nextFloat();
                    
                System.out.print("Ingresa tu segundo número: ");
                float b = scanner.nextFloat();
                    
                    
                //Operaciones
                suma = a + b;
                resta = a - b;
                mult = a*b;
        
                System.out.println("\n\n"); 
                System.out.println("El resultado de la suma es: " + suma);
                System.out.println("El resultado de la resta es: " + resta);
                System.out.println("El resultado de la multiplicación es: " + mult);

                //Excepción con la divisió, se debe cuidar que el denominador sea diferente a 0
                if(b == 0){
                    div = a/b;
                    System.out.println("Error por división con 0");
                } 
                else{
                    div = a/b;
                    System.out.println("El resultado de la división es: " + div);
                }
            break;
            
            //Método de 0 parámetros
            case 2:
                System.out.println("No existen parametros con los que realizar una operación.");
            break;
            
            //Método de 3 parámetros
            case 3:
                System.out.print("Ingresa tu primer número: ");
                    float c = scanner.nextFloat();
                    
                    System.out.print("Ingresa tu segundo número: ");
                    float d = scanner.nextFloat();
                    
                    System.out.print("Ingresa tercer número: ");
                    float e = scanner.nextFloat();

                    //Operaciones
                    suma = c + d + e;
                    resta = c - d - e;
                    mult = (c*d) * e;
        
                    System.out.println("\n\n"); 
                    //Resultados
                    System.out.println("El resultado de la suma es: " + suma);
                    System.out.println("El resultado de la resta es: " + resta);
                    System.out.println("El resultado de la multiplicación es: " + mult);

                    //Excepción con la divisió, se debe cuidar que el denominador sea diferente a 0
                    if(d == 0){
                        div = (c/d)/e;
                        System.out.println("Error por división con 0");
                    }
                    else if(e == 0){
                        div = (c/d)/e;
                        System.out.println("Error por división con 0");
                    }else{
                        div = (c/d)/e;
                        System.out.println("El resultado de la división es: " + div);
                    }
            break;
       
            //Salir del programa
            case 4:
                System.exit(0);
            break;
        }

    }
}