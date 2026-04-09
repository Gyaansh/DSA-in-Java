import java.util.ArrayList;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,3,2,5,34,63,67,49};
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            // if(list.get(i) > max){
            //     max = list.get(i);
            // } 
            max = Math.max(list.get(i),max);  
        }
        System.out.println(max);
    }
}
