public class NthRoot {
    public static int nR(int n , int m, int mid){
        long ans = 1;
        for(int i =1;i<=n;i++){
            ans = ans *mid;
            if(ans>m) return 2;
        }
        if(ans == m) return 0;
        return 1;
    }

    public static int Nroot(int n, int m){
        int start = 1;
        int end = m;
        while(start<=end){
            int mid = start + (end-start)/2;
            int nroot = nR(n,m,mid);
            if(nroot==0) return mid;
            else if(nroot==1) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        System.out.println("your ans is: "+Nroot(3,8));;
    }
}