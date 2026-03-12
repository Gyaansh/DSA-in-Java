package assignment;
import java.util.Arrays;
public class stringMergeSort {
    public static void mergeSort(String[] arr, int start, int end){
        if(start>=end) return;
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public static void merge(String[] arr, int start, int mid, int end){
        String[] temp = new String[end-start+1];
        int i =start, j=mid+1,idx=0;
        while(i<=mid && j<=end){
            if(arr[i].compareToIgnoreCase(arr[j]) < 1){
                temp[idx++] = arr[i++];
            } else {
                temp[idx++] = arr[j++];
            }
        }
        while(i<=mid)
            temp[idx++] = arr[i++];
        while(j<=end)
            temp[idx++] = arr[j++];
        for (i = 0; i < temp.length; i++) {
            arr[i+start] = temp[i];
        }
    }
    public static void main(String[] args) {
        String[] arr={"sun","earth","moon","mars"};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
