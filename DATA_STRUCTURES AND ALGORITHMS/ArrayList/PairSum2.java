import java.util.ArrayList;
public class PairSum2 {

    public static boolean isTargetSumExist(ArrayList <Integer> list, int target){
        int n = list.size();
        int lp = 0,rp = n-1;
        for (int i = 0; i < n-1; i++) {
            if(list.get(i) > list.get(i+1)){
                rp = i;
                lp = i+1;
                break;
            }
        }
        while(lp != rp){
            int sum = list.get(lp) + list.get(rp);
            if(sum == target){
                return true;
            }
            if(sum < target){
                lp = (lp+1) % n;
            } else {
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : new int[]{11,15,6,8,9,10}) {
            list.add(i);
        }
        if(isTargetSumExist(list, 11)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
