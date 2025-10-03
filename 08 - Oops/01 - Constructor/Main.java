import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Student obj1=new Student("James Gosling",810024148015L);
        System.out.println("Name : "+obj1.name);
        System.out.println("Rollno : "+obj1.rollno);
    }
}

class Student{
    String name;
    long rollno;
    public Student(String name,long rollno){
        this.name=name;
        this.rollno=rollno;
    }
}