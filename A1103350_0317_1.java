import java.util.*;

public class A1103350_0317_1{
    public static void main(String[] argv) {
        int St, End, i = 0, j = 0 ;
         
        System.out.println("Please enter an starting value");
        Scanner st = new Scanner(System.in);
        St = st.nextInt();
          
        System.out.println("Please enter an ending value");
        Scanner end = new Scanner(System.in);
        End = end.nextInt();
        int [][] num = new int[St][End];
        for( j = 0  ; j <St ; j++) {
            for(i = 0 ; i<End ; i++) {
                num[j][i] = (i+1)*(j+1);
                
            }
        }

        for(int[] a : num){
            for(int b : a){
                System.out.print(b+" ");  
            }
            System.out.println();
        }
    }
}
        
         