import java.util.ArrayList;

public class stack {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            int top = list.get(list.size() - 1);
            list.remove(top);
            return top;
        }

        public static int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class StackL {
        Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }

        public int pop() {
            Node top = head;
            head = top.next;
            return top.data;
        }

    }

    public static void main(String[] args) {
        Stack a = new Stack();
        a.push(1);
        a.push(2);
        System.out.println(a.peek()); // Output: 2
        System.out.println(a.peek()); // Output: 2
        a.pop();
        System.out.println(a.peek()); // Output: 1
    }
}
