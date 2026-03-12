import java.util.Arrays;
public class mergeSort {
    public static void sort(int[] arr, int start, int end){
        if(start >= end) return;
        int mid = start +(end-start)/2;
        sort(arr, start, mid);
        sort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }

    public static void merge(int[] arr, int start, int mid, int end){
        int[] temp = new int[end-start+1];
        int i = start,j=mid+1,idx=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j])
                temp[idx++] = arr[i++];
            else
                temp[idx++] = arr[j++];
        }
        while(i<=mid)
            temp[idx++] = arr[i++];
        while(j<=end)
            temp[idx++] = arr[j++];

        for (idx = 0, i=start; idx < temp.length; idx++,i++) 
            arr[i] = temp[idx];
    }

    public static void main(String[] args) {
        int[] arr = {6,3,9,5,2,8,9,-10};
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}
