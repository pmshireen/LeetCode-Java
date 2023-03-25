package PracticePP;
//https://leetcode.com/problems/ugly-number/
public class UglyNo {
    public static void main(String[] args) {
         int n = 6;
         boolean ans = isUgly(n);
        System.out.println(ans);
    }

    public static boolean isUgly(int n) {
        if(n <= 1){
            return true;
        }
        int c = 2;
        for(c = 2;c <= 5;c++) {

                if((n%c == 0) && (n%7 != 0)) {
                    return true;
                }
        }
        return false;
    }
}

