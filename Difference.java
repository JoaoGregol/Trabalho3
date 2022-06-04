import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Difference {
    public static void main(String[]args){
        Integer[] a = {2, 4, 7, 13, 14, 15, 16};
        Integer[] b = {1, 6, 7, 11, 13, 16, 18};

        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(a));

        Set<Integer> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(b));

        Set<Integer> difference = new HashSet<>(s1);
        difference.removeAll(s2);

        System.out.println("Diferença: " + difference);
    }
        
}












