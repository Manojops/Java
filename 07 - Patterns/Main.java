public class Main{
    public static void main(String[] args) {
        pattern11(5);
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

    //Pattern8
    static void pattern8(int n){
        for(int row=1;row<=n;row++){
            for(int i=1;i<=n-row;i++){
                System.out.print("  ");
            }
            for(int i=1;i<=2*row-1;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern9
    static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern10
    static void pattern10(int n){
        for(int row=1;row<=n;row++){
            for(int i=1;i<=n-row;i++){
                System.out.print("  ");
            }
            for(int i=1;i<=2*row-1;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }

            for(int j=1;j<=2*(n-i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pattern11
    static void pattern11(int n){
        int inc=1;
        for(int row=1;row<=n;row++){    
            for(int j=1;j<=row;j++){
                System.out.print(inc);
                inc++;
            }
            System.out.println();
        }
    }

}