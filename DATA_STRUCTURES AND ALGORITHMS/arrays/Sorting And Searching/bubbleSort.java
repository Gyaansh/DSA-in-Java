public class bubbleSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int swaps = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swaps +=1;

                }
            }
            if(swaps==0) return;
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
