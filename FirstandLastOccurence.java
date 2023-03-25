package PracticePP;
//In usorted array
public class FirstandLastOccurence {
    public static void main(String[] args) {
        int[] arr = {1,3,5,5,5,5};
        int target = 5;
       // find(arr,target);
       // findOcc(arr,target);
       int ans[]=  findOccRet(arr,target);
        System.out.println(ans);
    }
    static void find(int[] arr,int target){
        int firstIndex = 0;
        int lstIndex = 0;
        boolean found =false;

        for(int i=0;i<arr.length;i++) {
            if(arr[i] == target) {
                if( ! found) {
                    firstIndex = i;
                    lstIndex = i;
                    found = true; //found for the first time
                    System.out.println(found);
                }
                else {
                    lstIndex = i;
                }
            }
        }

        if(found == false) {
            System.out.println("The element does not exist in the array");
        }
        else {
            System.out.println("firstIndex " + firstIndex);
            System.out.println("lstIndex " + lstIndex);
        }
    }

    static void findOcc(int[] arr,int target) {
        int n = arr.length;

        int first = -1, last = -1;

        for (int i = 0; i < n; i++) {
            if (target != arr[i])
                continue;
            if (first == -1) {
                first = i;
            }
            last = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = "+ first);
            System.out.println("Last Occurrence = " + last);
        }
        else
            System.out.println("Not Found");

    }
    static int[] findOccRet(int[] arr,int target) {
        int n = arr.length;
        int[] temp = new int[5];
        int k = 0;
        int first = -1, last = -1;

        for (int i = 0; i < n; i++) {
            if (target != arr[i])
                continue;
            if (first == -1) {
                first = i;
                temp[k] = i;
                k++;

            }
            last = i;
            temp[k] = i;
            k++;
        }
        if (first != -1) {
            return temp;

            //System.out.println("First Occurrence = "+ first);
            //System.out.println("Last Occurrence = " + last);
        }
        else{
            return temp;
            //System.out.println("Not Found");
        }


    }


}
