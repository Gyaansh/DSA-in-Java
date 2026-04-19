import java.util.ArrayList;

public class FrequentNumberFollowingKey {

    public static int mostFrequentElementFollowingKey(ArrayList<Integer> nums, int key) {
        int ans = Integer.MIN_VALUE, freq = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            int curr = nums.get(i);
            if (curr == key) {
                if (ans == curr)
                    freq++;
                if (ans != curr && freq > 0) {
                    freq--;
                }
                if (freq == 0) {
                    ans = nums.get(i + 1);
                    freq++;
                }
            }
        }
        if(ans == Integer.MIN_VALUE){
            return -1;
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(200);

        int key = 1;

        int ans = mostFrequentElementFollowingKey(nums, key);
        System.out.println(ans);
    }
}
