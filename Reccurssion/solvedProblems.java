public class solvedProblems {


    public static int fO(int arr[],int j,int i){
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]== j){
            return i;
        }
        return fO(arr, j ,i+1);
    }

    public static int lO(int arr[],int j,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lO(arr, j, i+1);
        if(isFound==-1 && arr[i]== j){
            return i;
        }
        return isFound;
    }

    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int optPower(int x , int n){
        if(n==0){
            return 1;
        }

        int halfpower = optPower(x, n/2);
        int halfpowerFun = halfpower * halfpower;

        if(n%2!=0){
            return halfpowerFun * x;
        }
        else{
            return halfpowerFun;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println(lO(arr, 10 ,0));
        System.out.println(optPower(2 , 5)); 
        System.err.println(5/2);
    } 
}