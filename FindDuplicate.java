package PracticePP;

import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = duplicateOccurence(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        int temp = 0;
        int n = nums.length;
        int count=0;
        for(int i =0;i<n;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(nums[i] == nums[j]) {
                    count++;
                    temp = nums[j];
                }
            }
        }
        return temp;
    }
    public static int duplicateOccurence(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
    }
}
