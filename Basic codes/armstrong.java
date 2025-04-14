import java.util.*;

public class armstrong {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(update(num));
        if (update(num)==num) {
            System.out.println(num+"  is armstrong number");
        }else{
            System.out.println(num+" is not armstrong");
        }
    }
    static int update(int num) {
        int armstrong = 0;
        for (int count = 1; count <= 3; count++) {
            int rem = num % 10;
            num = num / 10;
            armstrong = armstrong + (int) Math.pow(rem, 3);
        }
        return armstrong;
    }
   
}
