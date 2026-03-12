public class maxSubArraySum {
    public static void maxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        //Calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int sum = i==0? (prefix[0]) : (prefix[j] - prefix[i-i]);
                if(sum>maxSum) maxSum = sum;

            }
        }
        System.out.println("Max Sum of sub Array is "+maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,-1,3,-8,9,10};
        maxSubArray(arr);
    }
}
