import java.util.*;

public class index {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.right);
        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.data + " ");
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> level = new LinkedList<>();
            level.add(root);
            level.add(null);
            while (level.isEmpty()) {
                Node head = level.poll();
            }
        }
    }

    public static void common(int h1, int h2, int h3, int h4) {
        int diff1 = h2 - h1;
        int diff2 = h3 - h2;
        int diff3 = h4 - h3;

        if ((h1 < 0) || (h2 < 0) || (h3 < 0) || (h4 < 0)) {
            System.out.println("not valid");
            return;
        }

        if (diff1 == diff2) {
            System.out.println(diff1);
            return;
        }
        if (diff1 == diff3) {
            System.out.println(diff1);
            return;
        }
        if (diff2 == diff3) {
            System.out.println(diff2);
            return;
        }

        System.out.println(" ");
        System.out.println("None");

    }

    public static boolean isPrime(int a){
        if(a<2){
            return false;
        }
        for(int i=2; i<=a/2; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public static int sumOFmtonprime(int m , int n){
        int sum =0;
        int count = 0;
        int i = 0;
        while(count<=m+n){
            if(isPrime(i)){
                count++;
                System.out.println("step 1");
                if(count>=m && count<=m+n){
                    sum += i;
                    System.out.println("step 2, c++");
                }
            }
            i++;
            System.out.println("i++");
        }
        return sum;
    }

    public static void main(String[] args) {
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.err.println("");
        System.out.println(root.data);
        tree.postOrder(root);

        int h1 = 2;
        int h2 = 4;
        int h3 = 6;
        int h4 = 7;
        common(h1, h2, h3, h4);

        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        for (int i = 0; i < a.length; i++) {
            int arr[] = a[i];
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println(" ");
            } else {
                for (int j = arr.length - 1; j >= 0; j--) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println(" ");
            }

        }

        System.out.println("hiiii");
        System.out.println("sum :"+ sumOFmtonprime(2, 2));
        String a = "I love my India";
        String b[] = a.split(" ");
        for(int i = 0; i<b.length;i++){
            System.err.println(b[i]);
        }
    }
}