package matriz;

/**
 *
 * @author Angel
 */
public class Matriz {
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op=new Operaciones();
        op.MultiConstante();
        op.MultiMat();
    }
    
}

//clases 

package matriz;

/**
 *
 * @author Angel
 */
public class Operaciones {
    
//    int[][] mat=new int [3][3];
   int[][] mat={
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };
     double[] res=new double [9];
   public void MultiConstante(){
   for(int i=0;i<3;i++){
       for(int j=0;j<3;j++){
       res[i]=mat[i][j]*10;
       System.out.println("EL RESULTADO DE " + mat[i][j] + " ES :" + res[i]);
            }
        }
   }
   public void MultiMat(){
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               res[i]=mat[i][j]*mat[i][j];
               System.out.println("EL RESULTADO DE "+ mat[i][j] +" * "+ mat[i][j]+ " ES : "+ res[i]);
                }
            }
        }
   }

