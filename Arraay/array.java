import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i <=4 ; i++) {
        arr[i] = sc.nextInt();
       }
       
       System.out.print(Arrays.toString(arr));
     
    }
    
}
