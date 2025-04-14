public class  Classroom{
    public static int maxActivity(int[] start, int end[]){
        int count = 1;
        int prevactivity = end[0];
        for(int i =1;i<end.length; i++){
            if(prevactivity<=start[i]){
                prevactivity = end[i];
                count++;
            }
        }
        return count;
    };

    public static void main(String[] args) {
        int start[] = {1,3,4,3,11};
        int end[] = {4,4,10,11,15};
        System.out.println("hello world !");
        System.out.println(maxActivity(start, end));
    }
}