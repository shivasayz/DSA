package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    int cnt = 0;

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        cnt++;
    }

    public void insertAtStart(int data){
        Node newNode = new Node(data);

        if (head == null){
            this.insert(data);
        }

        Node temp = head;
        head = newNode;
        newNode.next = temp;
        cnt++;
    }

    public void insertAtK(int idx, int data){

        if (head == null || head.next == null || idx > cnt){
            System.out.println("Element can't inserted!");
        }

        Node newNode = new Node(data);
        if (idx == 1){
            Node first = head;
            head = newNode;
            newNode.next = first;
        }

        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;

            if (count == idx-1){
                newNode.next = temp.next;
                temp.next = newNode;

            }
            temp = temp.next;
        }
    }

    public void display(){
        Node temp = head;

        if (temp == null){
            System.out.println("List is empty...");
            return;
        }

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void deleteAtStart(){
        if (head == null){
            System.out.println("List is empty...");
            return;
        }
        head = head.next;
    }

    public void deleteAtTail(){
        Node temp = head;

        if (head == null){
            System.out.println("List is empty...");
            return;
        }

        if (head.next == null){
            head = null;
            return;
        }

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    

}

public class Basic {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.insert(70);
        list.insert(80);
        list.insert(90);
        list.display();

        list.deleteAtStart();
        list.display();

        list.deleteAtTail();
        list.display();

        list.insertAtStart(122);
        list.display();

        list.insertAtK(3, 333);
        list.display();

    }
}
