package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import util.Employee;
import util.Student;


public class StreamsGrouping {

    public static void main(String[] args) {
        
        List<Student> students = Student.getAll();

        System.out.println("Given Students: " + students.toString());

        System.out.println("Students grouping by age: " +
        students.stream().collect( Collectors.groupingBy(Student::getAge, Collectors.counting()))
        );

        System.out.println("Students grouping by academics, and by max age: " +
        students.stream().collect(Collectors.groupingBy(Student::getAcademics, 
                            Collectors.maxBy(Comparator.comparingInt(Student::getAge)))));
        
        /** Group the employees, by department and highest salary */
        List<Employee> emps = Employee.getEmployees();

        emps.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

        
        
                
                
    }
}
