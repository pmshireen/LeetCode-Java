package PracticePP;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {6,3,2};
        int a = arr1.length;
        int b = arr2.length;

       boolean ans = Subset(arr1,arr2,a,b);
       if(ans == true){
           System.out.println("arr2 is a subset of arr1");
       }
       else {
           System.out.println("Not a subset");
       }

    }
    static boolean Subset(int []arr1,int []arr2,int a,int b){
        for(int i = 0;i<b;i++) {
            for(int j = 0;i<a;j++) {
                if(arr2[i] == arr1[j]) {
                    break;
                }
                if(j == arr1.length -1 ) {
                    return false;
                }
            }

        }
        return true;
    }



}
