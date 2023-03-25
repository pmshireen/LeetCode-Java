package PracticePP;

import java.util.Arrays;

public class IntersectionElement {
    public static void main(String[] args) {
       int[] nums1 = {4,9,5};
       int[] nums2 = {9,4,9,8,4};
       int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {


        int k = 0, count = 0;
        int[] ans = new int[0];
        for (int i = 0; i < nums1.length; i++) {

            for (int j = i; j < nums2.length; j++) {

                if (nums2[j] == nums1[i]) {
                    count++;
                    System.out.println(count);
                    ans = new int[count];
                    ans[k] = nums1[j];
                    k++;
                }
            }
        }
        return ans;
    }
}
