import java.util.*;

public class Main {
    public static void assignAl(ArrayList<Integer> list, int n) {
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
    }

    public static void printAl(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static int findMax(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i =1;i < list.size();i++) {
            max = Math.max(max,list.get(i));
        }
        return max;
    }

    public static void swapTwoVal(ArrayList<Integer> list, int a, int b){
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void main(String[] args) {
        // Java Collection Framework
        // ClassName Object = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        assignAl(list, 10);
        swapTwoVal(list, 0, 9);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        // printAl(list);
        // System.out.println(findMax(list));
    }
}
