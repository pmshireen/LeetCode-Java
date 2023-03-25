package PracticePP;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int ans = searchInsert(nums, target);
        System.out.println(ans);
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(target > nums[end]){
            return end+1;
        }

        if(target < nums[start]){
            return start;
        }

        while(start <= end){
           int  mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                end = mid-1;
            }

            if(nums[mid] < target){
                start = mid+1;
            }
        }
        return start;
    }
}


