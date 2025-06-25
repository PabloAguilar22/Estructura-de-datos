//Importación de librerías
import java.util.Scanner;
public class Sumas {
    public static void main(String [] args) {
        //Creación de un nuevo scanner
        Scanner scanner = new Scanner(System.in);
        //declaración de variables
        int n1;
        int n2;
        //Registro del primer número
        System.out.println("Ingresa el primero número: ");
        n1 = scanner.nextInt();
        //Registro del segundo número
        System.out.println("Ingresa un segundo número: ");
        n2 = scanner.nextInt();
        //Nuevo objeto de la clase 
        Suma suma = new Suma( n1, n2);
        //Mostrar resultado
        System.out.println("El resultado de la suma es: " + suma.calcular());
        //Se cierra el scanner
        scanner.close();        
    }
}

//Clase Suma, en donde se realiza la operación correspondiente
class Suma{
    //Declaración de variables o atributos
    private int a;
    private int b;
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
