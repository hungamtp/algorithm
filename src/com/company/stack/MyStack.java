package com.company.stack;

public class MyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();
    }
    private StackNode top;
    private int size;
    class StackNode {
        int value;
        StackNode next;

        public StackNode(int value) {
            this.value = value;
        }
    }

    public boolean push(int value) {
        StackNode newNode = new StackNode(value);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
        return true;
    }

    public StackNode pop() {
        if(size == 0) return null;

        StackNode temp = top;
        top = top.next;
        temp.next = null;

        size--;
        return temp;
    }

    public void printStack() {
        while (top != null) {
            System.out.println(top.value);
            top = top.next;
        }
    }
}
