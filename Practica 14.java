package recursividad;

/**
 *
 * @author Angel
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op=new Operaciones();
        op.Division();
        op.Potencia();
        op.Factorial();
        op.Multiplicacion();
        op.Fibonacci();
        
    }
    
}


package recursividad;
import java.util.Scanner;
/**
 *
 * @author Angel
 */
public class Operaciones {
    int opc,opc1;
    Scanner in = new Scanner(System.in);
    public void Factorial(){
        System.out.println("\nINGRESA EL NUMERO " );
        opc=in.nextInt();
        System.out.print("EL FACTORIAL DE " + opc + " ES " + funcionFac(opc));
    }
    public int funcionFac(int num){
        if(num==0 || num==0){
            return 1;
        }else{
            return num*funcionFac(num-1);
        }
    }
    public void Fibonacci(){
        System.out.println("\nINGRESA EL NUMERO " );
        opc=in.nextInt();
        System.out.print("EL FACTORIAL DE " + opc + "  ES ");
        for(int i=0;i<opc;i++){
            System.out.print(" , " + funcionFibo(i));
        }
    }
    public int funcionFibo(int num){
    if(num == 0 || num==1){
               return num;
    }else{
               return funcionFibo(num-1) + funcionFibo(num-2);
        }
    }
    public void Multiplicacion(){
        System.out.println("\nINGRESA EL NUMERO " );
        opc=in.nextInt();
        System.out.println("\nINGRESA EL NUMERO " );
        opc1=in.nextInt();
        int res=funcionMult(opc,opc1);
        System.out.print("EL RESULTADO DE LA MULTIPLICACION ES : " + res);
    }
        public int funcionMult(int num,int num2){
        if(num2==0){
            return 0;
        }else if (num2>0){
            return num+funcionMult(num,num2-1);
        }else{
            return -funcionMult(num,-num2);
        }
        }
    public void Potencia(){
        System.out.println("\nINGRESA EL NUMERO " );
        opc=in.nextInt();
        System.out.println("\nINGRESA EL NUMERO " );
        opc1=in.nextInt();
        int res=funcionPot(opc,opc1);
        System.out.print("EL RESULTADO DE LA POTENCIA ES : " + res);
    }
    public int funcionPot(int num, int num2){
    if (num2 < 0) {
            throw new IllegalArgumentException("❌ No se puede calcular potencias con exponente negativo (por ahora).");
        }
        // Caso base
        if (num2 == 0) {
            return 1;
        }else{
        return num*funcionPot(num,num2-1);
        }
    }
    
    public void Division(){
        System.out.println("\nINGRESA EL NUMERO " );
        opc=in.nextInt();
        System.out.println("\nINGRESA EL NUMERO " );
        opc1=in.nextInt();
        int res=funcionDiv(opc,opc1);
        System.out.print("EL RESULTADO DE LA DIVISION ES : " + res);
    }
    
    public int funcionDiv(int num, int num2){
    if(num2==0 ){
        throw new IllegalArgumentException("❌ No se puede calcular devidir entre 0");
    }if (num<num2){
    return 0;
    }else {
        return 1+funcionDiv(num-num2,num2);
    }
    }
}
