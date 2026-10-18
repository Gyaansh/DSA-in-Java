import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
    int findLargestRectangle(int[] arr){
        int[] ls = new int[arr.length];
        int[] rs = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while(!s.isEmpty() && arr[i]<arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
                rs[i]=6;
            else
                rs[i] = s.peek();
            s.push(i);
        }
        s.clear();
        for (int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && arr[i]<arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty())
                ls[i]=-1;
            else
                ls[i] = s.peek();
            s.push(i);
        }
        int maxArea=1;
        for (int i = 0; i < arr.length; i++) {
            int width = 1 * (rs[i]-ls[i]-1);
            int area = arr[i] * width;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
    void main(){
        int[] arr = {2,1,5,6,2,3};
        int ans = findLargestRectangle(arr);
        System.out.println(ans);
    }
}
