package PracticePP;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(countRotation(arr));

    }
    static int countRotation(int[] arr){
        int pivot = findpivot(arr);
        return pivot+1;
    }

// with no duplicates
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            // 4 cases over here
            if (mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid < start && arr[mid] > arr[mid+1]){
                return mid - 1;
            }
            //case 3:
            if(arr[mid] <= start){
                end = mid-1;
            }

            else{
                start = mid + 1;//search in second half of array where the pivot lies
            }

        }
        return -1;
    }
    //with duplicates
    static int findpivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            // 4 cases over here
            if (mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid < start && arr[mid] > arr[mid+1]){
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //start and end are same ,skip the duplicates
                //NOTE: what if these elements at start and end were pivot
                if(arr[start] > arr[start+1]){
                    return  start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end;
                }
                end--;
            }
            //left side is sorted ,so pivot should be in right
            else if(arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid +1;
            }else{
                end = mid+1;
            }

        }
        return -1;
    }
}
