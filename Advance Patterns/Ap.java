public class Ap {

    public static void main(String[] args) {
        floyd_traingle(6);
    }

    public static void zero_one_Traingle(int num) {
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                    ;
                }
            }
            System.err.println();
        }
    }

    public static void floyd_traingle(int num) {
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.err.print(count);
                count++;
            }
            System.err.println();

        }
    }

    public static void hollow_Rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == 1 || i == 1 || j == 6 || i == 4) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.err.println();

        }
    }

    public static void butterfly_effect(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void star_num(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void reversestar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void gap_star(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void char1(int n) {
        char a = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

}
