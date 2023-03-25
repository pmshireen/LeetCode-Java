package PracticePP;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleOccurence {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }

    public static int singleNumber(int[] nums) {
        int size = nums.length;
        // Isolate the first number in the array
        int result = nums[0];

        // Traverse through the entire array starting from the second number
        for (int i = 1; i < size; i++) {
            result = result ^ nums[i];
        }
            return result;
    }
}