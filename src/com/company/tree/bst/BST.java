package com.company.tree.bst;

public class BST {
    MyTreeNode root;

    public BST() {
    }

    public BST(MyTreeNode root) {
        this.root = root;
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
            if (value < node.value) {
                node = node.left;
            } else if (value > node.value) {
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
        } else if (value > root.value) {
            return rContains(root.right, value);
        } else {
            return true;
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
    public void print() {
        if (root == null) {
            return;
        }
        rPrint(root);
    }

    public void rPrint(MyTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.value);
        if (root.left != null) {
            rPrint(root.left);
        }
        if (root.right != null) {
            rPrint(root.right);
        }
    }


}
