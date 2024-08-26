package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import util.Student;

public class StreamCompare {

    public static void main(String[] args) {
    
        List<Integer> numbers = Arrays.asList(3,45,5,2,5,3,22,40, 4);

        System.out.println("Input Numbers List: " + numbers.toString());

        //compare using comparator
        Comparator<Integer> comp = (i1, i2)->i1.compareTo(i2);
        
        System.out.println("Sorting using comparator: " +
                    numbers.stream().sorted(comp).collect(Collectors.toList()));

        System.out.println("Sorting using sorted() in natural order: " +
            numbers.stream().sorted().collect(Collectors.toList()));
        
        System.out.println("Sorting using sorted() in reverse order: " +
            numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
            );

        //Compare using custom comparator
        List<Student> studentslist = Student.getAll();

        System.out.println("\nStudents List: " + studentslist.toString());

        studentslist.stream().sorted((o1, o2) -> {
                return o1.getName().compareTo(o2.getName());
        } );
        System.out.println("Sorting of Objects: using compareTo: By Name: " 
                        + studentslist.toString());
        
        //Sort using sorted(), with comparator

        System.out.println("Sorting objects by Age: " +
        studentslist.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList()));
        System.out.println("Sorting objects by Name, in reverse order: " +
        studentslist.stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList()));
        
        
    }
}
