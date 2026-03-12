// package assignment;

import java.util.Arrays;

public class inversion {
    
    public static int findInversion(int[] arr){
        int temp[] = new int[arr.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        int swaps = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(temp[j]>temp[j+1]){
                    swaps++;
                    int a = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1]=a;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        System.err.println(findInversion(arr));
        System.out.println(Arrays.toString(arr));
    }
}