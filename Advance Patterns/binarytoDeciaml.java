public class binarytoDeciaml {

     public static int btod(int binary){
        int power = 0;
        int decimal = 0;
        while(binary>0){
            int reminder = binary%10;
            decimal = decimal+reminder*(int)Math.pow(2, power);
            power ++;
            binary /= 10;
        }
        return decimal;
     }

     public static String dtb(int decimal){
        String Binary = "";
        while(decimal>0){
            int reminder = decimal % 2;
            Binary = reminder + Binary;
            decimal /= 2;
        }
        return  Binary;
     }
    public static void main(String[] args) {
        System.out.println("  ");
        System.out.println("hii");
        System.out.println(btod(1110011011));
        System.out.println(dtb(923));
    }
}
