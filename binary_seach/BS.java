class BS{


    public static int reccursiveBS(int arr[], int start, int end, int key){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]>key){
            return reccursiveBS(arr, start, mid-1, key);
        }
        if(arr[mid]<key){
            return reccursiveBS(arr, mid+1, end, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int a = reccursiveBS(arr, 0, arr.length-1, 11);
        System.out.println(a);
    }
}