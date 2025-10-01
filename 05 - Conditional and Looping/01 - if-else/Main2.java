public class Main2{
    public static void main(String[] args) {
        float avg=91;
        if(avg>=90){
            System.out.println("Grade : A");
        }

        else if(avg<90 && avg>=50){
            System.out.println("Grade : B");
        }

        else{
            System.err.println("Fail");
        }
    }
}