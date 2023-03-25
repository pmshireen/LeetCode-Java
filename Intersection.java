package PracticePP;

import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection {
    public static void main(String[] args) {
        int []nums1 = {1,2,2,1};
        int []nums2 = {2,2};
        int temp[] = intersection(nums1,nums2);
        System.out.println(Arrays.toString(temp));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int temp[] =  new int[nums1.length+nums2.length];
        int k = 0;
        for(int i = 0;i<nums1.length-1;i++){
            for(int j = 0;j < nums2.length-1;j++){

                if(nums2[j] == nums1[i]) {
                    temp[k] = nums2[j];
                    k++;
                    break;
                }

            }

        }
        return temp;
    }
}
