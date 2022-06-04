import java.util.Arrays;

public class Uniao{
    public static void main(String[]args){
    int[]a = {2, 4, 7, 13, 14, 15, 16};
    int[]b = {1, 6, 7, 11, 13, 16, 18};
    int[]uniao = juntar(a,b);
    
    System.out.println(Arrays.toString(uniao));

  }
  protected static int[] juntar(int[]a, int[]b){
    int []uniao = new int[a.length + b.length];
    int rodar = 0;


    for (int i= 0; i < a.length; i++)
    uniao[rodar++] = a[i];


    for (int i= 0; i < b.length; i++)
    uniao[rodar++] = b[i];

    return uniao;

  }
}

   