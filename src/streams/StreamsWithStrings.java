package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithStrings {

    public static List<String> strings() {
        return Arrays.asList(
            "hi", "hi", "thanks", "hello", "welcome", "thanks", "gratitude", "cheers", "congrats", "happy"
        );
    }
    
    public static void main(String[] args) {

        /** find duplicate elements in a string 
        Eg: name = "george" 
        O/p: [g, e] */

        String name = "George Prathap";

        List<String> strList = Arrays.asList(name.split(""));

        System.out.println("Duplicate elements in the string: " + name
            + " : " + strList.stream().filter(e->Collections.frequency(strList, e)> 1).distinct()
        .collect(Collectors.toList()));

        
        List<String> stringsList = strings();

        System.out.println("Given String List: " + stringsList.toString());
        System.out.println("Grouping by length: " +
        stringsList.stream().collect(Collectors.groupingBy(String::length))
        );

        System.out.println("Sorted - " +
        stringsList.stream().sorted().collect(Collectors.toList())
        );

        
        System.out.println("Duplicates: " +
        stringsList.stream().filter(s -> Collections.frequency(stringsList, s) > 1).distinct().collect(Collectors.toList())
        );
        


    }
}
