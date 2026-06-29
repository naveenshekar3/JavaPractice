package DSAlgo.LinkedList;

import com.google.gson.internal.GsonTypes;

public class AddNodeAtEndOfLinkedList {

    class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static Node head = null;
    Node tail = null;
    public void addNodeAtEnd(int n){
        Node newNode = new Node(n);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public void printLinkedList(Node headNode){
        Node current = headNode;
        while (current!=null){
            System.out.println(current.val);
            current = current.next;
        }

    }

    public static void main(String[] args) {
         AddNodeAtEndOfLinkedList add = new AddNodeAtEndOfLinkedList();
         add.addNodeAtEnd(10);
        add.addNodeAtEnd(20);
        add.addNodeAtEnd(30);
        add.addNodeAtEnd(40);
        add.printLinkedList(head);
    }
}
