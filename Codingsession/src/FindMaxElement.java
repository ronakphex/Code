import java.util.Arrays;
import java.util.List;

public class FindMaxElement {

    public static Integer findMaxElement(List<Integer> values){
        return values.stream().mapToInt(Integer::intValue).max().getAsInt();
    }


    public static int minElementFromArray(int[] a){
        return Arrays.stream(a).min().getAsInt();
    }

    public static int maxElementFromArray(int[] a){
        return Arrays.stream(a).max().getAsInt();
    }


    public static void main(String[] args) {
       System.out.println("Max Element:"+
               findMaxElement(List.of(3,90,350,5)));

       int[] a = {6,8,3,5,1,9};

       System.out.println("Min Element value:"+minElementFromArray(a));
       System.out.println("Max Element value:"+maxElementFromArray(a));
    }
}
