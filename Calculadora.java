import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //Creación de un nuevo scanner
        Scanner scanner = new Scanner(System.in);
        
        //declaración de variables
        int n1;
        int n2;
        
        //Registro del primer número
        System.out.print("Ingresa el primero número: ");
        n1 = scanner.nextInt();
        
        //Registro del segundo número
        System.out.print("Ingresa un segundo número: ");
        n2 = scanner.nextInt();
        
        //Nuevos objetos de las nuevas clases
        Suma suma = new Suma( n1, n2);
        Resta resta = new Resta(n1, n2);
        Mult mult = new Mult(n1, n2);
        Div div = new Div( n1, n2);
        
        //Mostrar resultado
        System.out.println("");
        System.out.println("--- El resultado de la suma es: " + suma.calcular() + " ---");
        System.out.println("--- El resultado de la resta es: " + resta.calcular() + " ---");
        System.out.println("--- El resultado de la multiplicación es: " + mult.calcular() + " ---");
        
        //Condición puesta a la división, solo cuando se indetermina con 0 en el dividendo
        if ( n2 == 0) {
            System.out.println("--- No se puede realizar la operación por dividir entre 0. ---");
        } else {
             System.out.println("--- El resultado de la división es: " + div.calcular() + " ---");
        }
       
        //Se cierra el scanner
        scanner.close(); 
    }
}

class Suma{
    //Declaración de variables o atributos
    private final int a;
    private final int b;

    //Constructor
    public Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }
        
    //Método para realizar la suma
    public int calcular(){
        return a + b;
    }
}

class Resta{
    //Declaración de variables o atributos
    private final int a;
    private final int b;

    //Constructor
    public Resta(int a, int b) {
        this.a = a;
        this.b = b;
    }
        
    //Método para realizar la suma
    public int calcular(){
        return a - b;
    }
}

class Mult{
    //Declaración de variables o atributos
    private final int a;
    private final int b;

    //Constructor
    public Mult(int a, int b) {
        this.a = a;
        this.b = b;
    }
        
    //Método para realizar la suma
    public int calcular(){
        return a * b;
    }
}

class Div{
    //Declaración de variables o atributos
    private final int a;
    private final int b;

    //Constructor
    public Div(int a, int b) {
        this.a = a;
        this.b = b;
    }
        
    //Método para realizar la suma
    public int calcular(){
        
        return a / b;
    }
}