import java.util.Arrays;

public class quickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr, int start, int end) {
        if(start>=end) return;
        int pIdx = partition(arr, start, end);
        sort(arr, start, pIdx - 1);
        sort(arr, pIdx + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, end, i);
        return i;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8, -10 };

        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}