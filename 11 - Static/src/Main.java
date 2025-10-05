
public class Main {
    public static void main(String[] args) {
        Student s1=new Student("Manoj",8015);
        Student s2=new Student();
        Student s3=new Student("Suriya",8127);
        Student s4=new Student("Ram",9122);

        Student[] obj={s1,s2,s3,s4};

        for(Student stu : obj){
            System.out.println("Name : "+stu.name);
            System.out.println("Rollno : "+stu.rollno);
            System.out.println();
        }

        Student.students();
    }
}
