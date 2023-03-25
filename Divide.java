package PracticePP;

public class Divide {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = -1;
        int res = divide(dividend,divisor);
        System.out.println(res);

    }
    static int divide(int dividend, int divisor) {

        int flag = -1;
        if(divisor < 0 && dividend < 0){
            dividend = dividend * -1;
            divisor = divisor * -1;
            int ans = dividend/divisor;
            //ans *= flag;
            return ans;

        }
        else {
            int res = dividend / divisor;
            return res;
        }
    }
}
