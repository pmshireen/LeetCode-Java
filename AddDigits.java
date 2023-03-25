package PracticePP;
//https://leetcode.com/problems/add-digits/
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2   output = 2
public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        int ans = addDigits(num);
        System.out.println(ans);
    }
    public static int addDigits(int num) {
        if(num == 0){
            return num;
        }
        int rem = 0;
        int count = 0;
        int sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
            count ++;
        }
        int res = sum%10;
        if(res != (sum)){
            return addDigits(sum);
        }
        if (count == 0) {
            return sum;
        }
        return sum;
    }
}
