public class Main{
    public static void main(String[] args) {
        //Type Conversion (Implicit conversion)
        byte a=123;
        int b=a;  //byte can store in integer container
        System.out.println(b);

        //Type casting (Explicit conversion)
        float f=3.14f;
        int c=(int)f;       //float type cannot store int container,because int range is smaller than float
        System.out.println(c);

        //Type Promotion
        byte num1=40;
        byte num2=20;
        int result=num1*num2;
        //here num1 multiply num2,ans will be 800,the ans also byte datatype,but it will promotes
        System.out.println(result);
    }
}