package PracticePP;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-array/
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 4;
        rotate(nums,k);

    }
    public static void rotate(int[] nums, int k)   {
       int n =  nums.length;
        for(int i = 0; i < k; i++){
            int j, last;
            //Stores the last element of array
            last = nums[n-1];
            for(j = nums.length-1; j > 0; j--){
                //Shift element of array by one
                nums[j] = nums[j-1];
            } //Last element of array will be added to the start of array.
            nums[0] = last;
        }
        System.out.println(Arrays.toString(nums));
    }
}
