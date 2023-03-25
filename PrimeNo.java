package PracticePP;

import java.util.Scanner;
public class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not");
        int n = in.nextInt();
        if(n <= 1)
        {
            System.out.println("Neither prime nor composite");
            return ;

        }
        int c = 2;
        while (c * c  <= n){

            if (n % c == 0){
                System.out.println("Not Prime");
                return ;

            }
            c = c + 1;
        }

        if (c * c > n) {
            System.out.println("Prime");
            return ;
        }


    }


}