import java.util.ArrayList;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(1);
        // list2.add(2);
        // ArrayList<Integer> list3 = new ArrayList<>();
        // list3.add(3);
        // list3.add(4);
        // list.add(list2);
        // list.add(list3);
        // for (int i = 0; i < list.size(); i++) {
        //     ArrayList<Integer> sub = list.get(i);
        //     for (int j = 0; j < sub.size(); j++) {
        //         System.out.print(sub.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        System.out.println(list);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
        ArrayList<Integer> list3 = new ArrayList<>(List.of(2,4,8));
        ArrayList<Integer> list4 = new ArrayList<>(List.of(3,6,9));
        list.add(list2);
        list.add(list3);
        list.add(list4);
        System.out.println(list);

    }

}
