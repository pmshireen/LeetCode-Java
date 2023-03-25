package PracticePP;
//Write a program in Java to calculate the number of times a digit ‘D’ appears in a number N.
// You have to take N and D as inputs from the user.
//Input = 142454
//Output = The digit 4 occurs 3 times in 142454

public class DigitFreq {
    public static void main(String[] args) {
           int n = 142454;
           int target = 4;
           int ans = countDigitFreq(n,target);
           System.out.println(target +" Occurs "+ans+ " times");
    }
    static int countDigitFreq(int n,int target) {

        if(n == 0 && target == 0) {
            return 1;
        }
        //if a negative number is entered
        if(n < 0) {
            n = n * -1;
        }

        int counter = 0;

        while(n != 0) {
            int digit = n % 10; //calculate the digit
            if(digit == target) {
                counter++;
            }
            n = n/10;
        }
        return counter;
    }

}
