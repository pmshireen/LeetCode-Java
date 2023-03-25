package PracticePP;
//https://leetcode.com/problems/single-number-ii/
public class SingleNumber2 {
    public static void main(String[] args) {
        int nums[] ={2,2,3,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
    public static  int singleNumber(int[] nums) {
        int count =0;
        int c = 0;
        int number;
        for(int i = 0;i<nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count !=3 &&  count != 2 ){
                return nums[i];
            }
        }

        return count;
    }

}
