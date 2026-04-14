import java.util.ArrayList;

public class ContainerWMWater {

    public static int calculateWater(ArrayList<Integer> list) {
        int lp = 0, rp = list.size() - 1;
        int maxWater = 0;
        while (lp < rp) {
            int height = Math.min(list.get(lp),list.get(rp));
            int width = rp-lp;
            maxWater = Math.max(maxWater,height*width);
            if(list.get(lp) < list.get(rp)){
                lp++;
            } else{
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        for (int i :new int[] {1,8,6,2,5,4,8,3,7}) {
            list.add(i);
        }
        int ans = calculateWater(list);
        System.out.println(ans);
    }
}
