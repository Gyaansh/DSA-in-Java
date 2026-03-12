public class RotatedArray {
    public static int search(int[] arr, int start, int end, int key) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (arr[mid] == key)
            return mid;

        if (arr[start] <= arr[mid]){ // Line 1
        
            if(arr[start]<=key && key <= arr[mid]){
                return search(arr, start, mid-1, key);
            } else{
                return search(arr, mid+1, end, key);
            }
        }
        else{ //Line 2
            if(arr[mid] <= key && key <= arr[end]){
                return search(arr, mid+1, end, key);
            } else {
                return search(arr, start, mid-1, key);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, arr.length-1, 3));
    }
}