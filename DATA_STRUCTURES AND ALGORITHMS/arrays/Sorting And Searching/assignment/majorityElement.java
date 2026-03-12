package assignment;
public class majorityElement {
    public static int majority(int[] arr) {
        int candidate = arr[0], count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==candidate){
                count++;
            }else{
                if(count == 0){
                    candidate = arr[i];
                    count++;
                } else{
                    count--;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2, };
        System.out.println(majority(arr));
    }
}
