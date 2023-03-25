package PracticePP;
//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public static void main(String[] args) {
       int[] nums = {0,1,2,2,3,0,4,2};
       int val = 2;
       int ans = removeElement(nums,val);
        System.out.println("Ans : "+ans);
    }
    static int removeElement(int[] nums, int val) {
         int count = 0;
         int size = nums.length;
        for(int i=0; i< size; i++)
        {
            if(val == nums[i])
            {
                for(int j=i; j<(size-1); j++) {
                    nums[j] = nums[j + 1];
                }
                size--;
                i--;
                count++;
            }
        }
        if(count==0)
            System.out.println("\nElement not found!");
        else
        {
            System.out.println("\nRemoved the element successfully!");
            System.out.println("The new array is: ");
            for(int k = 0; k < size; k++)
                System.out.print(nums[k]+ " ");
        }



        return size;
    }
}
