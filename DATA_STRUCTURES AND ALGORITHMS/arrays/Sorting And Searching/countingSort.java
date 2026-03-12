public class countingSort {
    public static void sort(int[] arr){
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest , arr[i]);
        }
        int[] freq = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]] += 1; 
        }
        int j=0;
        for (int i = 0; i < freq.length; i++) {
            while(freq[i]>0){
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,7,2,9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
