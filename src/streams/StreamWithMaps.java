package streams;

import java.util.HashMap;
import java.util.Map;

public class StreamWithMaps {

    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        
        //1. Iterate Map Objects using forEach

        System.out.println("Given Map - iterate: ");
        map.forEach((x,y) -> { System.out.print(x + " - " + y + "; ");});

        //2. Iterate Map Object using entry Set Stream

        System.out.println("\nGiven Map - iterate with entryset : ");
        map.entrySet().stream().forEach((object) ->  {
            System.out.print(object.getKey() + " - " + object.getValue() + "; ");
        });


       //3. Check if there is atleast one key that matches 3 
       
       System.out.println("\nIs there atleast one key that matches 3: " + 
            map.entrySet().stream().map(v->v.getKey()).anyMatch(x -> x == 3));

       //4. Check if all the keys are equal to 4

       System.out.println("Does all the keys match 4: " +
        map.entrySet().stream().map(v->v.getKey()).allMatch(x -> x == 4));

       
       
    }
}
