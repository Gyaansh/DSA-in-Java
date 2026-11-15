import java.util.Arrays;

public class Rope {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Arrays.sort(arr);
        int res = 0;
        int cost = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cost+=arr[i];
            res+=cost;
        }
        System.out.println(res);
    }
}
