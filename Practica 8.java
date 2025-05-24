public class Promedio{
    public static void main(String[] args) {
        // TODO code application logic here
        CalcularP cal=new CalcularP();
        cal.Datos();
        cal.Calculos();
        cal.Resultados();
    }
}  

import java.util.Scanner;

/**
 *
 * @author Angel
 */

public class CalcularP {
        int num1,num2,num3,num4,num5;
        double pro,med,max,min,suma;
  
    public void Datos(){
     Scanner in=new Scanner(System.in);
        System.out.println("PROMEDIO DE 5 NUMEROS");
        System.out.println("Ingrese un numero : ");
        num1=in.nextInt();
        System.out.println("Ingrese un numero : ");
        num2=in.nextInt();
        System.out.println("Ingrese un numero : ");
        num3=in.nextInt();
        System.out.println("Ingrese un numero : ");
        num4=in.nextInt();
        System.out.println("Ingrese un numero : ");
        num5=in.nextInt();
}
        public void Calculos(){
        suma=num1+num2+num3+num4+num5;
        pro=suma/5;

         max = num1;
        if (num2 > max) max = num2;
        if (num3 > max) max = num3;
        if (num4 > max) max = num4;
        if (num5 > max) max = num5;

        // Calcular mínimo
        min = num1;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;
        if (num4 < min) min = num4;
        if (num5 < min) min = num5;

        // Para calcular la mediana sin arreglo, los ordenamos "a mano"
        // Método burbuja simplificado para 5 valores
        int a = num1, b = num2, c = num3, d = num4, e = num5;

        // Ordenar manualmente (no óptimo pero funcional para 5)
        if (a > b) { int t = a; a = b; b = t; }
        if (a > c) { int t = a; a = c; c = t; }
        if (a > d) { int t = a; a = d; d = t; }
        if (a > e) { int t = a; a = e; e = t; }
        if (b > c) { int t = b; b = c; c = t; }
        if (b > d) { int t = b; b = d; d = t; }
        if (b > e) { int t = b; b = e; e = t; }
        if (c > d) { int t = c; c = d; d = t; }
        if (c > e) { int t = c; c = e; e = t; }
        if (d > e) { int t = d; d = e; e = t; }

        // La mediana será el valor "c" (posición 3)
        med = c;
    }
    public void Resultados(){
        // Mostrar resultados
        System.out.println("\nRESULTADOS");
        System.out.println("La ssuma es : " + suma);
        System.out.println("Promedio : " + pro);
        System.out.println("Mediana : " + med);
        System.out.println("Maximo : " + max);
        System.out.println("Minimo : " + min);
    }
}
