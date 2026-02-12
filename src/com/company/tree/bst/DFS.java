package com.company.tree.bst;

public class DFS {
    public static void main(String[] args) {
        BST bst = new BST();

        MyTreeNode root = new MyTreeNode(10);
        bst.root = root;
        root.left = new MyTreeNode(5);
        root.right = new MyTreeNode(15);
        root.left.left = new MyTreeNode(4);
        root.left.right = new MyTreeNode(6);
        root.right.right = new MyTreeNode(20);
        root.right.left = new MyTreeNode(11);
        System.out.println("DFS Traversal- inorder LEFT -> ROOT -> RIGHT");
        inorder(root);
        System.out.println();
        System.out.println("DFS Traversal- preorder ROOT -> LEFT -> RIGHT");
        preorder(root);
        System.out.println();
        System.out.println("DFS Traversal- postorder LEFT -> RIGHT -> ROOT");
        postorder(root);
    }

    public static void inorder(MyTreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void preorder(MyTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(MyTreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }
}
