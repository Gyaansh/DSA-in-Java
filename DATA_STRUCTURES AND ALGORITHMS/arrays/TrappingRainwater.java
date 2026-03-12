// import java.util.Arrays;
public class TrappingRainwater {

public static void trappedRainwater(int[] height){// Time Complexity 0(n)
    int length = height.length, width =1;
    int[] right_max = new int[length];
    int[] left_max = new int[length];
    // left_max
    //calculating left max height
    left_max[0] = height[0];
    for (int i = 1; i < left_max.length; i++) {
        //Easy method
        // if(height[i] > left_max[i-1]) left_max[i] = height[i];
        // else left_max[i] = left_max[i-1];
        //This can also be written as
        
        left_max[i] = Math.max(height[i], left_max[i-1]);
    }
    //Calculating right max height
    right_max[length-1] = height[length-1];
    for (int i = length-2; i >= 0; i--) {
        right_max[i] = Math.max(height[i] , right_max[i+1]);
    }
    int trappedWater = 0;
    for (int i = 0; i < length; i++) {
        //Water level  = min (left bound , right bound)
        int waterLevel = Math.min(left_max[i], right_max[i]);

        //ttrapped water is water level - height of building/block
        trappedWater += (waterLevel - height[i]) * width;

    }
    System.out.println("Total trapped water is : "+trappedWater);

}

    public static void main(String[] args) {
        int []height = {4,2,0,6,3,2,5};
        trappedRainwater(height);
    }
}
