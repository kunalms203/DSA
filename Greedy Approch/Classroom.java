import java.util.Arrays;
import java.util.Comparator;

public class Classroom {
    public static int maxActivity(int[] start, int end[]) {
        int count = 1;
        int prevactivity = end[0];
        for (int i = 1; i < end.length; i++) {
            if (prevactivity <= start[i]) {
                prevactivity = end[i];
                count++;
            }
        }
        return count;
    };

    public static int maxValue(int value){
        int currency[] = {1,2,5,10,20,50,100,500,2000};
        int maxLength = 0;
        for(int i = currency.length-1; i>=0;i--){
            if (value == 0) {
                return maxLength;
            }
            while(currency[i]<=value){
                maxLength ++;
                value -= currency[i];
                System.err.println(currency[i]);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int start[] = { 1, 3, 4, 3, 11 };
        int end[] = { 4, 4, 10, 11, 15 };
        System.out.println("hello world !");
        System.out.println(maxActivity(start, end));
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int  w = 50;
        double ratio[][] = new double[value.length][2];
        for(int i =0; i<value.length; i++){
            ratio[i][0]= i;
            ratio[i][1]= value[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int capacity = w;
        int finalvalue = 0;
        for(int i =ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalvalue += value[idx];
                capacity -= weight[idx];
            }else{
                finalvalue += (capacity*ratio[i][1]);
                capacity =0;
                break;
            }
        }
        System.out.println("final value = "+ finalvalue);
        System.out.println(maxValue(590));
    }
}