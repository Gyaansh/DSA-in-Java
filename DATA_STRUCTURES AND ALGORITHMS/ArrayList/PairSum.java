import java.util.ArrayList;

public class PairSum {
    public static boolean isTargetSumExist(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size() - 1;
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        if(isTargetSumExist(list, 2)){
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}
