import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(size-i-1)+" ");
        }
    }
}
