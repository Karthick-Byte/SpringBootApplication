import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Program {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,50,12,74,13);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, (I1,I2) -> (I1>I2)?-1:(I1<I2)?+1:0);
        System.out.println("Descending" + list);
    }
    
}
