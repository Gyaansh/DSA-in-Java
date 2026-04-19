import java.util.ArrayList;

public class Monotone {

    public static boolean isMonotone(ArrayList<Integer> list) {
        boolean dec = false, inc = false;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
                inc = true;
            } else if (list.get(i) > list.get(i + 1)) {
                dec = true;
            }
        }
        if ((dec && inc)) {
            return false;
        } else if (dec || inc) {
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        // list.add(4);
        list.add(2);
        if (isMonotone(list)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
