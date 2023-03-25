package PracticePP;

//Input: aaabbbcc
//output:a3b3c2

import java.util.HashMap;
import java.util.Scanner;

public class Alphacount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))) {
                int res = hm.get(s.charAt(i))+1;
                hm.put(s.charAt(i), res);
            }else{
                hm.put(s.charAt(i), 1);
            }
        }
        String t = "";
        for (int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                t += s.charAt(i) + "" + hm.get(s.charAt(i)) + "";
                hm.remove(s.charAt(i));
            }
        }
        System.out.println(t);
        in.close();
    }
}