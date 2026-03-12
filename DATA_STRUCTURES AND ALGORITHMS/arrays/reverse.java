import java.util.Arrays;
public class reverse {

    public static void reverseArray(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7};
        reverseArray(num);
        System.out.println(Arrays.toString(num));

    }
    
}