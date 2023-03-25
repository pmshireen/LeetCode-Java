package PracticePP;

import java.util.Arrays;

public class DuplicateValues {
    public static void main(String[] args) {
        int[] arr = {1,4,5,4};

        int []arr1 = findDuplicates(arr);
        System.out.println(arr1);

    }
    static int[] findDuplicates(int[] arr) {
        for(int i = 0;i<arr.length;i++) {
            for(int j = i+1;j < arr.length;j++) {
                if(arr[i] == arr[j] && i != j) {
                    System.out.println("Duplicate elements : "+ arr[i]);
                }

            }
        }
        return arr;
    }
}
