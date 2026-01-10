package com.company.dataStructure;

import java.util.HashSet;
import java.util.Set;

public class MyLinkedList {
    public static void main(String[] args) {
        System.out.println("LinkedList");
    }

    private MyNode head;
    private MyNode tail;

    class MyNode {
        int value;
        MyNode next;

        MyNode(int value) {
            this.value = value;
        }
    }

    public MyLinkedList(int value) {
        MyNode newNode = new MyNode(value);
        head = newNode;
        tail = newNode;
    }

    public MyNode getHead() {
        return head;
    }

    public MyNode getTail() {
        return tail;
    }

    public void printList() {
        MyNode temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        MyNode newNode = new MyNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public MyNode findMiddleNode() {
        MyNode slowP = head;
        MyNode fastP = head;

        while (fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
        }
        return slowP;
    }

    public boolean hasLoop() {
        MyNode slowP = head;
        MyNode fastP = head;

        while (fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if (slowP == fastP) {
                return true;
            }
        }
        return false;
    }

    public MyNode findKthNodeFromEnd(int k) {
        MyNode fastP = head;
        MyNode slowP = head;
        for (int i = 0; i < k; i++) {
            if (fastP == null) {
                return null;
            }
            fastP = fastP.next;
        }
        while (fastP != null) {
            slowP = slowP.next;
            fastP = fastP.next;
        }
        return slowP;
    }

    public void removeDuplicate() {
        Set<Integer> set = new HashSet<>();
        MyNode currentNode = head;
    }

    public int binaryToDecimal() {
        // have no idea how many element
        // find lenght
        // 2^(n) + 2^(n-1)+ ... + 2^(0)
        // Loop through the list
        // if node.next != null
        // sum += sum *2 + currentNode.value
        return 1;
    }

    public void reverseBetween() {
        MyNode head = this.head;
        MyNode currentNode = head.next;
        while (currentNode.next != null && currentNode.next.next != null) {
            MyNode temp = currentNode.next.next;
            currentNode.next.next = currentNode;

        }
    }


}

