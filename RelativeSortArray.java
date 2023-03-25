package PracticePP;


import java.util.Arrays;

//Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
//
//  Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
//  Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
//  Example 1:
//
//        Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//        Output: [2,2,2,1,4,3,3,9,6,7,19]
//        Example 2:
//
//        Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//        Output: [22,28,8,6,17,44]
public class RelativeSortArray {
    public static void main(String[] args) {

        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        int[] temp = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            temp[i] = arr2[i];
        }

        int[] ans1 = sort(arr1);
        System.out.println(Arrays.toString(ans1));

        int[] ans2 = sort(arr2);
        System.out.println(Arrays.toString(ans2));

        int ans3[] = sortRel(ans1,ans2,temp);
        System.out.println(Arrays.toString(ans3));

    }
    static int[] sort(int []arr ){


        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    static int[] sortRel(int []arr1,int []arr2,int[] temp) {
        int k = 0;

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0;j < arr1.length; j++) {

                if(arr2[i] == arr1[j]) {
                    break;
                }
                if(arr2[i] != arr1[j]) {
                    temp[k] = arr1[i];
                    k= k+1;
                    System.out.println(temp[k]);
                }
            }
        }
        return temp;
    }
}
