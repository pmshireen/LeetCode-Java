package PracticePP;
//https://leetcode.com/problems/powx-n/
public class Power {
    public static void main(String[] args) {
        double x = 2.00000;
        long n = 10;
        double ans = myPow(x,n);
        System.out.println(ans);
    }
    public static double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / myPow(x, -n);
        if (n % 2 == 1)
            return x * myPow(x, n - 1);
        return myPow(x * x, n / 2);
    }
}
