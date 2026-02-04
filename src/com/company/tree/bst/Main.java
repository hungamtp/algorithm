package com.company.tree.bst;

public class Main {
    public static void main(String[] args) {
        MyTreeNode root = new MyTreeNode(10);
        BST tree = new BST(root);
        tree.insert(11);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.print();
        System.out.println(tree.contains(7));
    }
}
