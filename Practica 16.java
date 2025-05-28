package ordenamientoburbuja;


public class OrdenamientoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Palabras="HOLAMUNDO";

        Operaciones op=new Operaciones();
        op.Caracteres();
        op.Enteros();
        System.out.println("\nOriginal: " + Palabras);
        System.out.println("Ordenado: " + op.Texto(Palabras));
        
        
    }
    
}



package ordenamientoburbuja;

/**
 *
 * @author Angel
 */
public class Operaciones {
    static char[] letras={'a','f','e','r','h'};
    static int[] numeros={7,5,2,8,6};
     //static String palabras="HOLA MUNDO";
    
    public void Enteros(){
        System.out.print("\nArreglo original: ");
        for (int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] + " ");
        for(int j=0;j<numeros.length-1-i;j++){
        if(numeros[j]>numeros[j+1]){
                int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
            }
        }
    }
    System.out.print("\nArreglo ordenado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
    public void Caracteres(){
        System.out.print("El arreglo original : ");
        for (int i=0;i<letras.length;i++){
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
    
    public String Texto(String palabras){
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
        return new String(caracteres);

    }
}

