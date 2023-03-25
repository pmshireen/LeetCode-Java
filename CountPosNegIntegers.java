package PracticePP;

public class CountPosNegIntegers {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1};
        int max= maximumCount(nums);
        System.out.println(max);
    }
    public static int maximumCount(int[] nums) {
          int count = 0;
          int c = 0;
          for(int i = 0;i < nums.length;i++) {
              if(nums[i] == 0){
                  break;
              }
              if(nums[i] < 0){
                  count++;
              }
              else{
                  c++;
              }
          }
          if(count > c){
              return count;
          }
          else{
              return c;
          }
    }
}
