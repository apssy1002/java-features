package util;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String department;
    private Integer salary;

    Employee(String name) {
        this.name = name;
    }
    Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String toString() {
        return(this.name + " : " + this.salary + " - " + this.department);
    }

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();

        String[] names = {"Hari", "Sri", "Chari"};

        for(int i=0; i<3; i++) {
            Employee emp = new Employee(names[i], "dep: " + (i+1), 1000*(i+1));
            employees.add(emp);
        }

        Employee emp = new Employee("Vishnu", "dep: 2" , 10000);
        employees.add(emp);
        
        return employees;
    }

}



