public class queue {
    public static class Queue{
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        
        public static void add(int x){
            if (rear == size-1){
                System.out.println("Queue is full");
            }

            else{
                arr[++rear] = x;
            }
        }

        public static int remove(){
            int front = arr[0];
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            for(int i = 0; i < rear ; i ++){
                arr[i] = arr[i+1];
            }
            return front;
        }

         
    }
}