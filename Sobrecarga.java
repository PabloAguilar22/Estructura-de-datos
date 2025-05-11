import java.util.Scanner;

public class Sobrecarga {

    public static void main(String[] args) {
        
    //Declaración de la variable opción
        Scanner scanner = new Scanner(System.in);
            
    //Declaración de la variable opción
        int op;
          
        do{
                
            System.out.println("==== CALCULADORA ====");
              
        //Opciones
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Cerrar");
                
        //Registro de la opción
            System.out.println("SELECCIONE UNA OPCIÓN: ");
            op = scanner.nextInt();
                
            if(op >= 1 && op <= 4){
                    
            //Primer número
                System.out.print("Ingrese su primer número: ");
                int n1 = scanner.nextInt();
                    
            //Segundo número
                System.out.print("Ingrese su segundo número: ");
                int n2 = scanner.nextInt();
                    
            //Tercer número
                System.out.print("¿Deseas ingresar un tercer npúmero?(S/N) ");
                char res = scanner.next().charAt(0);
                    
                Calcular calcular;
                    
            //Nuevos objetos de las nuevas clases
                if ( res == 's' || res =='S'){
                        
                    System.out.print("Ingrese su tercer número: ");
                    int n3 = scanner.nextInt();
                       
                    calcular = new Calcular (n1, n2, n3);
                        
                } else{
                        
                    calcular = new Calcular (n1, n2);
                }
                    
            //Menú de opciones
                switch(op){
                        
                //Suma
                    case 1:  
                        System.out.println("El resultado de la suma es: " + calcular.suma());
                    break;
                //Resta
                    case 2: 
                        System.out.println("El resultado de la resta es: " + calcular.resta());    
                    break;
                //Multiplicación
                    case 3: 
                        System.out.println("El resultado de la multiplicación es: " + calcular.mult());
                    break;   
                //División
                    case 4: 
                        if(n2 == 0){
                            System.out.println("No se puede realizar la operación por dividir entre 0.");
                        }else{
                            System.out.println("El resultado de la división es: " + calcular.div());
                        }
                    break;

                }
//Cierre de programa
            }else if (op != 5){
                System.out.println("No existe esta opción.");
            }
        } while (op != 5);
            System.out.println("Cierre de Programa.");
            
        //Se cierra el scanner
        scanner.close(); 
    }
}

//Clase para las operaciones
class Calcular{
    private int a;
    private int b;
    private int c;

    //Sin parametros
    public Calcular() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
 
    //Constructor 2 parametros
    public Calcular(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }
    
    //Constructor 3 Parametros
    public Calcular(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int suma(){
        return a + b + c;
    }
    
    public int resta(){
        return a - b - c;
    }
    
    public int mult(){
        return a * b * (c == 0 ? 1 : c);
    }
    
    public double div(){
        double x = b + c;
        if (x == 0){
            System.out.println("División entre 0 no es posible.");
            return 0;
        }else{
            return a / x;
        }
    }
}
