package PracticePP;

//https://leetcode.com/problems/longest-consecutive-sequence/
public class Consecutive {
    public static void main(String[] args) {
         int[] nums = {100,4,200,1,3,2};
         int ans = longestConsecutive(nums);
         System.out.println(ans);
    }
    public static int longestConsecutive(int[] nums) {
        int l = 0;
         for(int i = 0;i<nums.length;i++){
             if(nums[i] == nums[i]+ 1){
                 l++;
             }
         }
         return l;
    }
}
