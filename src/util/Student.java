package util;

import java.util.Arrays;
import java.util.List;

public class Student {
    
    public String name;

    public int age;

    public String academics;

    public Student (String n, int a, String ac) {
        this.name = n;
        this.age = a;
        this.academics = ac;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAcademics() {
        return academics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAcademics(String academics) {
        this.academics = academics;
    }

    public String toString() {
        return ("\nStudent: " + this.getName() + ","
                            + this.getAge() + ", "
                            + this.getAcademics());
    }

    public static List<Student> getAll() {
        
       List<Student> students = Arrays.asList( 
            new Student("Tina", 30, "Masters in Tech"),
            new Student("Sim", 22, "Masters in Tech"),
            new Student("Sam", 28, "Masters in Business"),
            new Student("Andrew", 22, "Masters in Science")
            );

        return students;
    }
}
