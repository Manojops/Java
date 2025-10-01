public class Main{
    public static void main(String[] args) {
        pattern7(5);
    }

    //Pattern1
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern2
    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern3
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern4
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int i=1;i<=row;i++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    //Pattern5
    static void pattern5(int n){
        for(int row=1;row<=n;row++){
            if(row==1 || row==n){
                for(int col=1;col<=n;col++){
                    System.out.print("* ");
                }
            }

            else{
                System.out.print("* ");
                for(int col=1;col<=n-2;col++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern6
    static void pattern6(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                if(col==1 || col==row || row==n ){
                    System.out.print("* ");
                }

                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //Pattern7
    static void pattern7(int n){
        for(int row=1;row<=n;row++){
            for(int i=1;i<=row;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            for(int j=n-row;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}