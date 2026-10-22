public class TrappingRainwater {
    public static int totalWater(int[] arr){
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        int curr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(curr < arr[i]) curr = arr[i];
            leftMax[i] = curr;
        }
        curr=-1;
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] > curr) curr = arr[i];
            rightMax[i] = curr;
        }
        int totalWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int waterLevel = Math.min(rightMax[i],leftMax[i]) - arr[i] * 1; //current water level for each building width is one
            totalWater+=waterLevel;
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int arr[] = {7,0,4,2,5,0,6,4,0,5};
        System.out.println(totalWater(arr));

    }
}
