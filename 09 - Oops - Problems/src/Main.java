//Design a class as described below.
//
//class name : MyClass
//function: function name - display(), parameters - none, return type - void , access modifier - public, function body - should print "Hello World"

public class Main {
    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.display();
    }
}

class MyClass{
    public void display(){
        System.out.println("Hello World");
    }
}
