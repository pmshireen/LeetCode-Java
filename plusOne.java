package PracticePP;

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
      int[] digits = {9};
      int[] ans = separateDigits(digits);
      System.out.println(Arrays.toString(ans));

    }
    public static int plusOneOccur(int[] digits) {
        int n = digits.length;
        int rem;
        int sum = 0;
        for(int i = 0;i<n;i++){
            rem = digits[i]%10;
            sum = sum * 10 + rem;
            System.out.println("sum "+sum);
        }
        sum = sum + 1;
        System.out.println(sum);
        return sum;
    }




    static int[] separateDigits(int[] digits){
        int n = digits.length;
        int j = 0;
        int sum =plusOneOccur(digits);
        while(sum != 0 && n > 1) {
            int r = sum % 10;
            digits[j-1] = r;
            j--;
            sum = sum/10;
        }
        if(digits.length == 1 && sum != 0){
            int size = digits.length + 1;
            digits = new int[size];
            int rem = sum % 10;
            digits[size] = rem;
            size --;
            sum = sum/10;
        }


        return digits;
    }

}