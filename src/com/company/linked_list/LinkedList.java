package com.company.linked_list;

public class LinkedList {
    public static void main(String[] args) {
        var ll = new LinkedList(1);
        ll.append(2);
        ll.append(2);
        ll.append(3);
        ll.removeFirst();
        ll.removeLast();
        ll.prepend(0);
        ll.appendLast(10);
        ll.append(2);
        ll.append(3);
        ll.removeLast();
        ll.printAll();

    }

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length += 1;
    }

    public void removeFirst() {
        this.head = this.head.next;
        this.length -= 1;
    }

    public void removeLast() {
        if (this.length == 0) {
            return;
        }
        if (length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            var currentNode = this.head;
            var prev = currentNode;
            while (currentNode.next != null) {
                prev = currentNode;
                currentNode = currentNode.next;
            }

            this.tail = prev;
            this.tail.next = null;
        }
        this.length -= 1;
    }

    public void appendLast(int value) {
        Node newNode = new Node(value);
        this.tail.next= newNode;
        this.tail = newNode;
        this.length += 1;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;

        this.length +=1 ;
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = length + 1;
    }
    //   +===================================================+
    //   |                  WRITE YOUR CODE HERE             |
    //   | Description:                                      |
    //   | - Constructor for the LinkedList class.           |
    //   | - Initializes the linked list with a single node. |
    //   |                                                   |
    //   | Parameters:                                       |
    //   | - value: The integer value of the first node in   |
    //   |   the newly created linked list.                  |
    //   |                                                   |
    //   | Behavior:                                         |
    //   | - A new Node is created with the given value.     |
    //   | - This node is set as both the head and tail of   |
    //   |   the list, indicating it is the only node in the |
    //   |   list at creation.                               |
    //   | - The length of the list is initialized to 1.     |
    //   +===================================================+


    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

}


