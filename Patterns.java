package PracticePP;

/*
1.
    A
    B B
    C C C
    D D D D
    E E E E E
    F F F F F F

2.
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F

3.
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    A B C D E
    A B C D
    A B C
    A B
    A

4.
    A B C D E F
    A B C D E
    A B C D
    A B C
    A B
    A
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F

5.
    F E D C B A
    E D C B A
    D C B A
    C B A
    B A
    A
    A
    B A
    C B A
    D C B A
    E D C B A
    F E D C B A


*/
public class Patterns {
    public static void main(String[] args) {
//        pattern1();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
           pattern6();
    }
    static void pattern1(){
        int n = 6;
        int alphabet = 65;
        for(int i = 0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print((char)(alphabet + i)+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(){
        int n = 6;
        int alphabet = 65;
        for(int i = 0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();
        }
    }
    static void pattern3(){
        int n = 6;
        int alphabet = 65;
        for(int i = 0;i<n;i++){
            for(int j =0;j <= i;j++){
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();

        }
        for (int i = n; i >= 0; i--)
        {

            for (int j = 0; j <= i - 1; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(){
        int n = 6;
        int alphabet = 65;
        for(int i = n;i>0;i--){
            for(int j =0;j <= i - 1;j++){
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();

        }
        for (int i = 0; i <= n-1 ; i++)
        {

            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(){
        int n = 6;
        int alphabet = 65;
        for(int i = n;i > 0;i--){
            for(int j = i-1;j >= 0;j--){
                System.out.print((char)(alphabet+j)+" ");
            }
            System.out.println();

        }
        for (int i = 0; i <= n-1 ; i++)
        {

            for (int j = i; j >= 0; j--)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
    static void pattern6(){
        int n = 6;
        int alphabet = 65;
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }




}
