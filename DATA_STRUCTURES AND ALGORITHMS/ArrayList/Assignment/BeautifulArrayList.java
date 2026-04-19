import java.util.ArrayList;

public class BeautifulArrayList {
    public static ArrayList<Integer> getBeautiful(int n){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 2; i <= n; i++) {

            ArrayList<Integer> temp = new ArrayList<>();

            for (Integer e : res) {
                if(2*e <= n) temp.add(2*e); //For even elements
            }
            
            for (Integer e : res) {
                if(2*e-1 <= n) temp.add(2*e-1); // For odd elements
            }
            res = temp;
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(getBeautiful(3));
    }
}
