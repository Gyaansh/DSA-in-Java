import java.util.ArrayList;

public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mdList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 1; j < 6; j++) {
                temp.add(i * j);
            }
            mdList.add(temp);
        }
        System.out.println(mdList);

    }

}
