public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        int length;
    }

    public Node head = null;
    public Node tail = null;
    public int length = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = newNode;
            head = newNode;
        }else{
        newNode.next = head;
        head = newNode;
        }
        length++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void deleteFirst() {
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else if(head.next==null){
            head = tail = null;
        }else{
            head = head.next;
        }
        System.out.println("Deleted First Element");
        length--;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        System.out.println(" ");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteLast(){
        {
            if(head==null){
                System.out.println("Linked list is empty");
            }
            else if(head.next==null){
                head = tail = null;
            }else{
                Node temp = head;
                for(int i=0;i<length-2;i++){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                System.out.println("Deleted Last Element");
                length--;
            }
        }
    }

    public int search(Node head, int key){
        if(head==null){
            return -1;
        }
        Node temp = head;
        if(temp.data==key){
            return 0;
        }
        int idx = search(temp.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int reccursiveSearch(int key){
        return search(head,key);
    }
    public int iterativeSearch(int key){
        if(head==null){
            return -1;

        }
        int i = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addLast(5);
        System.out.println(" ");
        System.out.println(ll.reccursiveSearch(1));
        ll.print();
        ll.reverse();
        System.out.println(" this si reversed link list");
        ll.print();
        System.out.println("Length: " + ll.length);
        
    }
}