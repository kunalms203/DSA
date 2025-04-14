import java.util.Scanner;
class Primeno{
    public static void isprime(int a){
        if(a ==0 || a==1 || a==2){
            System.out.println(a +" is prime");
            return;
        }
        for(int i = 2; i<=a/2;i++){
            if(a%i==0){
                System.out.println(a+" is not prime");
                return;
            }
        }
        System.out.println(a+ " is a prime no");
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no : ");
        int n = sc.nextInt();
        isprime(n);
    }
}