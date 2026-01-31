package com.company.tree.bst;

public class BST {
    MyTreeNode root;

    public BST() {
    }

    public BST(MyTreeNode root) {
    }

    public boolean insert(int value) {
        if (root == null) {
            root = new MyTreeNode(value);
            return true;
        }
        MyTreeNode node = root;
        while (true) {
            if (value < node.value) {
                if (node.left == null) {
                    node.left = new MyTreeNode(value);
                    return true;
                } else {
                    node = node.left;
                }
            } else {
                if (node.right == null) {
                    node.right = new MyTreeNode(value);
                    return true;
                } else {
                    node = node.right;
                }
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        MyTreeNode node = root;
        while (node != null) {
            if (node.value < value) {
                node = node.left;
            } else if (node.value > value) {
                node = node.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean rContains(MyTreeNode root, int value) {
        if (root == null) {
            return false;
        }
        if (value < root.value) {
            return rContains(root.left, value);
        } else {
            return rContains(root.right, value);
        }
    }

    public void rInsert(MyTreeNode root, int value) {
        if (root == null) {
            root = new MyTreeNode(value);
        }
        if (value < root.value) {
            rInsert(root.left, value);
        } else {
            rInsert(root.right, value);
        }
    }
}
