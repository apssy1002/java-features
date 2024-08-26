package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAdditions {
public static void main(String[] args) {
    
    List<Integer> numberList = Arrays.asList( 2,4, 11,33,22,11,99,56,3,8,77,null);
    List<Integer> intlist1 = Arrays.asList(11,33,22,11,99,56,3,8,77,12);


    /* Picks the matching elements;
     Immediately stops picking elements, once the condition fails */
    System.out.println("take while divisible by 2 - " +
    numberList.stream().takeWhile(i->i%2==0).collect(Collectors.toList()));
    System.out.println("take while divisible by 11 - " +
    numberList.stream().takeWhile(i->i%11==0).collect(Collectors.toList()));
    
    /* If the criteria matches from the first element, drops the matched element 
        and continues with rest of the list ;
     * If the first entry itself is not matching, it will stop matching
     *  and returns same list
    */
    System.out.println("drop while divisible by 2 - " +
    numberList.stream().dropWhile(i->i%2==0).collect(Collectors.toList()));
    System.out.println("drop while divisible by 11 - " +
    numberList.stream().dropWhile(i->i%11==0).collect(Collectors.toList()));

    System.out.println("ignore null values - " +
    intlist1.stream().flatMap(i->Stream.ofNullable(i)).collect(Collectors.toList()));

}
}
