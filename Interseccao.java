import java.util.Arrays;

public class Interseccao {
    public static void main(String[]args){
    int[]a = {2, 4, 7, 13, 14, 15, 16};
    int[]b = {1, 6, 7, 11, 13, 16, 18};
    int[]c = inter(a,b);

        System.out.println(Arrays.toString(c));
    }

    private static int[] inter(int[]a,int b[]){
      int[]aux = new int[a.length + b.length];
      int k = 0;

      for(int i = 0; i < a.length; i++ )
         for(int j = 0; j < b.length; j++)
          if(a[i] == b[j])
            aux[k++] = a[i];
        
        int[]c = new int [k];
        for (int i = 0; i < k; i++)
        c[i] = aux[i];

        return c;
    }
}  
 

    
