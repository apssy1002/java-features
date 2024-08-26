package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamsWithNumbers {
    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(3,45,5,2,5,3,22,40, 4);

        System.out.println("Given Numbers: " + numbers.toString());

        //Filter the even numbers
        System.out.println("Even numbers in the list : " +
        numbers.stream().filter((var x) -> x%2 == 0).collect(Collectors.toList())
        );

        //Squares of the given numbers
        System.out.println("Squares of the given numbers : " + 
        numbers.stream().map((var x) -> x*x).collect(Collectors.toList())
        );

        System.out.println("Max of the list: " +
                numbers.stream().mapToInt(Integer::intValue).max().getAsInt());

        System.out.println("Min of the list: " +
                numbers.stream().min(Comparator.comparingInt(Integer::intValue)).get());

        //Partition the numbers as even and odd numbers
        System.out.println("Partition by even numbers: " +
        numbers.stream().collect(Collectors.partitioningBy((var x) -> x%2==0))  
        );

    }
}
