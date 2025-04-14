public class Backtracking {
    public static void changeArr(int arr[] , int i , int val){
        if(i== arr.length){
            return;
        }

        arr[i] = val;
        changeArr(arr, i+1, val+1);

        arr[i]= arr[i]-2; //changed evry value of array by -1 this is where the backtrackin happend
    }



    public static void printArr(int arr[] , int i){
        if(i== arr.length){
            return;
        }
        System.out.println(arr[i]+" ");
        printArr(arr, i+1);
    }

    public static void permutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0 ; i < str.length() ;i++ ){
            char crr = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            permutation(newstr, ans+crr);
        }
    }

    public static boolean isValis(char board[][] , int row , int coloumn){

        for(int i = row-1 ; i>= 0 ; i-- ){
            if(board [i][coloumn]=='Q'){
                return false;
            }
        }
        for(int j= coloumn-1,i=row-1;j>=0 && i>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int j= coloumn+1,i=row-1;j<=board.length-1 && i>=0;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void adjustBoard(char board[][] , int row ){
        if(row==board.length){
            printBoard(board);
            return;
        }
        for(int i =0 ; i<board.length ; i++){
            if(isValis(board, row, i)){
                board[row][i] = 'Q';
            adjustBoard(board, row+1);
            board[row][i] = '_';
            }
        }
    }

    public static void printBoard(char board[][]){
        int n = board.length;
        System.err.println("___________Chess Board___________");
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.err.println();
        }
    }

    public static void main (String[] args){
        int arr[] = new int[5];
        changeArr(arr, 0 , 1);
        printArr(arr, 0);
        String str = "abc";
        permutation(str, "");
        int n = 6;
        int k =0;
        char board[][]= new char[n][n];
        // initialize
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< n ; j++){
                board[i][j] = '_';
            }
        }

        adjustBoard(board, 0);

    }
}