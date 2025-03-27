package com.mycompany.sobrecarga;

public class Sobrecarga {
    
    public static void main(String[] args) {
    
        // Objeto con 0 parámetros
        Sobrecarga metodo1 = new Sobrecarga();
        System.out.println("--- Operaciones con 0 parámetros ---");
        System.out.println("No hay parametros, entonces no hay operaciones que realizar.");
        
        System.out.println();
        
        // Objeto con 2 parámetros
        Sobrecarga metodo2 = new Sobrecarga(12, 15);
        System.out.println("--- Operaciones con 2 parámetros ---");
        metodo2.suma();
        metodo2.resta();
        metodo2.mult();
        metodo2.div();
        System.out.println();

        // Objeto con 3 parámetros
        Sobrecarga metodo3 = new Sobrecarga(20, 22, 4);
        System.out.println("--- Operaciones con 3 parámetros ---");
        metodo3.suma();
        metodo3.resta();
        metodo3.mult();
        metodo3.div();
    }
    
    float a, b, c;
   
    // Constructor con 0 parámetros
    public Sobrecarga() {  
 
    }
    
    // Constructor con 2 parámetros
    public Sobrecarga(float a, float b) {
        this.a = a;
        this.b = b;
    }

    // Constructor con 3 parámetros
    public Sobrecarga(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void suma() {
        
        float resultado = a + b + c; 
        System.out.println("La suma es: " + resultado);
    }

    public void resta() {
        
        float resultado = a - b - c;
        System.out.println("La resta es: " + resultado);
    }

    public void mult() {
        float resultado = (c == 0) ? a * b : a * b * c; // Usa c solo si está definido
        System.out.println("La multiplicación es: " + resultado);
    }

    public void div() {
        if (b == 0) {
            System.out.println("Error en la operación, por dividir entre 0"); 
        } else{
            float resultado = (c == 0) ? a * b : a * b * c; // Usa c solo si está definido
            System.out.println("La división es: " + resultado);
        }
    }        
}