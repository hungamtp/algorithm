package com.company.stack;

public class MyQueue {
    private QueueNode first;
    private QueueNode last;
    private int length;

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        queue.enqueue(4);
        queue.dequeue();
        queue.display();
    }
    class QueueNode {
        int value;
        QueueNode next;

        public QueueNode(int value) {
            this.value = value;
        }
    }

    public void enqueue(int value) {
        QueueNode node = new QueueNode(value);
        if (length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++;
    }

    public QueueNode dequeue() {
        if (length == 0) return null;
        QueueNode temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;

    }
    public void display() {
        QueueNode current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
