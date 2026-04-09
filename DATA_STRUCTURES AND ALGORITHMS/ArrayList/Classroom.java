import java.util.ArrayList;
import java.util.Collections;
public class Classroom{

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        //O(1)
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(4);
        list.add(3);

        // System.out.println(list);
        // swap(list,2,4);
        System.out.println(list);
        // Collections.sort(list);//Ascending Order
        Collections.sort(list,Collections.reverseOrder());//Descending Order
        System.out.println(list);
        
        // System.out.println(list);
        // list.add(3,33);
        // System.out.println(list);
        // System.out.println(list.size());
        
        //O(1)
        // int ele = list.get(0);
        // System.out.println(ele);

        // //Remove O(n)
        // list.remove(2);
        // System.out.println(list);

        // //Set element at index
        // list.set(2,3);
        // System.out.println(list);

        // //Contain
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(2));
        

    }
}