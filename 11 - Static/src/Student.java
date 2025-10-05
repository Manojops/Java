public class Student {
    String name;
    int rollno;
    static int count=0;

    Student(){
        this.name="None";
        this.rollno=0000;
        count++;
    }

    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
        count++;
    }

    static void students(){
        System.out.println("Total Number of Students : "+count);
    }
}
