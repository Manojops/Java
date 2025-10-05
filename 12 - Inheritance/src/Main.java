public class Main {
    public static void main(String[] args) {
        Car c1=new Car("Jaguar","Black");
        c1.start();
        System.out.println("Brand : "+c1.name);
        System.out.println("Color : "+c1.color);
        c1.brake();
        c1.stop();
    }
}
