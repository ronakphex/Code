import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindDuplicateElements {

    public static Set<Integer> duplicatesCalculatePredicate(List<Integer> values,Predicate<Integer> duplicatePredicate){
        return
                values.stream().filter(duplicatePredicate)
                        .collect(Collectors.toSet());
    }


    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(5,13,4,21,13,27,2,59,59,34);
        Predicate<Integer> findingDuplicateValuesPredicate  = (value) -> Collections.frequency(values,value)>1;
        Set<Integer> duplicateValues = duplicatesCalculatePredicate(values,findingDuplicateValuesPredicate);

        System.out.println("Duplicate Values:"+duplicateValues);

        List<Integer> values1 = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
        Predicate<Integer> nonDuplicates  = (value) -> Collections.frequency(values1,value)==1;
        Set<Integer> nonDuplicateValues = duplicatesCalculatePredicate(values1,nonDuplicates);

        System.out.println("Non Duplicate values:"+nonDuplicateValues);
    }
}
