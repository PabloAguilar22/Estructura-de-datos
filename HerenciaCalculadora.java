import java.util.Scanner;

public class HerenciaCalculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n==== CALCULADORA ====");
            System.out.println("1. Sumar");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Cerrar");

            System.out.print("SELECCIONE UNA OPCIÓN: ");
            op = scanner.nextInt();

            if (op >= 1 && op <= 4) {

                System.out.print("Ingrese su primer número: ");
                int n1 = scanner.nextInt();

                System.out.print("Ingrese su segundo número: ");
                int n2 = scanner.nextInt();

                System.out.print("¿Deseas ingresar un tercer número? (S/N): ");
                char res = scanner.next().charAt(0);

                CalcularAvanzado calcular;

                if (res == 's' || res == 'S') {
                    System.out.print("Ingrese su tercer número: ");
                    int n3 = scanner.nextInt();
                    calcular = new CalcularAvanzado(n1, n2, n3);
                } else {
                    calcular = new CalcularAvanzado (n1, n2);
                }

                switch (op) {
                    case 1: 
                        System.out.println("El resultado de la suma es: " + calcular.suma());
                    break;
                    
                    case 2: 
                        System.out.println("El resultado de la resta es: " + calcular.resta());
                    break;
                    
                    case 3: 
                        System.out.println("El resultado de la multiplicación es: " + calcular.mult());
                    break;
                    
                    case 4: 
                        if ((calcular.getB() + calcular.getC()) == 0) {
                            System.out.println("No se puede realizar la operación por dividir entre 0.");
                        } else {
                            System.out.println("El resultado de la división es: " + calcular.div());
                        }
                    break;
                }
            } else if (op != 5) {
                System.out.println("No existe esta opción.");
            }
        } while (op != 5);

        System.out.println("Cierre de Programa.");
    }
}

// Clase base con getters
class Calcular {
    private int a;
    private int b;
    private int c;

    public Calcular() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Calcular(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }

    public Calcular(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int suma() {
        return a + b + c;
    }

    public int resta() {
        return a - b - c;
    }

    public int mult() {
        return a * b * (c == 0 ? 1 : c);
    }

    public double div() {
        double x = b + c;
        if (x == 0) {
            System.out.println("División entre 0 no es posible.");
            return 0;
        } else {
            return (double) a / x;
        }
    }

    // Getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}

// Clase hija con funciones avanzadas
class CalcularAvanzado extends Calcular {

    public CalcularAvanzado(int a, int b) {
        super(a, b);
    }

    public CalcularAvanzado(int a, int b, int c) {
        super(a, b, c);
    }

    public int modulo() {
        int divisor = getB() + getC();
        if (divisor == 0) {
            System.out.println("No se puede calcular el módulo con divisor 0.");
            return 0;
        }
        return getA() % divisor;
    }
}
