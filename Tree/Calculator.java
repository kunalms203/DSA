import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("1.Add ");
        System.out.println("2.Subtract ");
        System.out.println("3.mul ");
        System.out.println("4.Add ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Opratioon no you want");
        int a = sc.nextInt();
        System.out.println("Enter First no");
        int x = sc.nextInt();
        System.out.println("Enter First no");
        int y = sc.nextInt();
        if(a==1){
            System.out.println(x+y);
        }
        else if(a==2){
            System.out.println(x-y);
        }
        else if(a==3){
            System.out.println(x*y);
        }
        else if(a==4){
            System.out.println(x/y);
        }
        else{
            System.out.println("enter valid operation");
        }
    }
}
