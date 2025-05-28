package ordeburbujacomplejo;

/**
 *
 * @author Angel
 */
public class OrdeBurbujaComplejo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ORDENAMIENTO");
        Operaciones op=new Operaciones();
        op.Enteros();
        op.Caracteres();
        op.Texto();
    }
    
}



package ordeburbujacomplejo;

import java.util.Scanner;

public class Operaciones {
        int[] num=new int[5];
        char[] letras=new char[5];
        String palabras;
        Scanner in=new Scanner(System.in);
        
        public void Enteros(){
        for(int i=0;i<5;i++){
        System.out.println("Ingresa un numero ");
        num[i]=in.nextInt();
        }
        System.out.print("\nArreglo original: ");
        for (int i=0;i<5;i++){
            System.out.print(num[i] + " ");
        for(int j=0;j<num.length-1-i;j++){
        if(num[j]>num[j+1]){
                int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
            }
        }
    }
        System.out.print("\nArreglo ordenado: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
            }
        }
        
        public void Caracteres(){
            System.out.println();
            for(int i=0;i<5;i++){
        System.out.println("Ingresa una letra ");
        letras[i]=in.next().charAt(0);
        }
        System.out.print("\nEl arreglo original: ");
        for (int i=0;i<5;i++){
            System.out.print(letras[i] + " ");
        for(int j=0;j<letras.length-1-i;j++){
        if(letras[j]>letras[j+1]){
                char temp = letras[j];
                    letras[j] = letras[j + 1];
                    letras[j + 1] = temp;
            }
        }
    }
    System.out.print("\nArreglo ordenado: ");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }
        
        }
        
        
        public void Texto(){
            System.out.println("\nIngresa una palabra");
            palabras=in.next();
        char[] caracteres = palabras.toCharArray();

        for (int i = 0; i < caracteres.length - 1; i++) {
            for (int j = 0; j < caracteres.length - i - 1; j++) {
                if (caracteres[j] > caracteres[j + 1]) {
                    char temp = caracteres[j];
                    caracteres[j] = caracteres[j + 1];
                    caracteres[j + 1] = temp;
                }
            }
        }
        new String(caracteres);
        System.out.println(caracteres);
    }
}
