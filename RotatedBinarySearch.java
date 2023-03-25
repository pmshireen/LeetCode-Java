package PracticePP;

public class RotatedBinarySearch {
    public static void main(String[] args) {
         int[] arr ={5,1,3};
         System.out.println(findpivot(arr));
         int target = 5;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int pivot = findpivot(arr);
        System.out.println("pivot = "+pivot);
        //if you do not a find a pivot then the array is not rotated
        if (pivot == -1){
            //then do normal binary search
            return binarySearch(arr,target,0,arr.length-1);
        }
        //you have found the pivot, then you found two asc sorted arrays
        // 3 cases
        if(arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }

            return binarySearch(arr,target,pivot+1,arr.length-1);


    }
    static int binarySearch(int arr[],int target,int start , int end)
    {       while(start <= end )
            {
                int mid = start + (end - start)/2;
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }else{
                    return mid;
                }
            }
        return -1;
    }

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
}
