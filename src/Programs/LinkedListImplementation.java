package Programs;

public class LinkedListImplementation {

    public static class Node{
        int data;
        Node next;

        Node(int value){
            this.data = value;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNode(int val){

        Node newNode = new Node(val);
        if (head == null){
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display(){

        Node temp = head;

        if (temp == null){
            System.out.println("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public int remove(){

        Node temp = head;
        int val = 0;

        if (temp == null){
            System.out.println("List is empty");
        } else {
            val = head.data;
            head = temp.next;
        }
        return val;
    }

    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();
        list.addNode(12);
        list.addNode(32);
        list.addNode(52);
        list.display();
        System.out.println(list.remove()+" removed");
        list.display();
        System.out.println(list.remove()+" removed");
        list.display();
    }
}
