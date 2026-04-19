import java.util.ArrayList;

public class Lonely {

    public static ArrayList<Integer> getLonely(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int curr = list.get(i);
            if(newList.contains(curr)){
                newList.remove(Integer.valueOf(curr));
                continue;
            }
            if( (!list.contains(curr+1)) && (!list.contains(curr-1)) ){
                newList.add(curr);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        ArrayList<Integer> loners = new ArrayList<>();
        loners = getLonely(list);
        System.out.println(loners);
    }
}
