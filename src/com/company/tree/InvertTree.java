package com.company.tree;

import com.company.tree.bst.MyTreeNode;

public class InvertTree {
    public static void main(String[] args) {

    }

    public static MyTreeNode invertTree(MyTreeNode root) {

        if (root == null) {
            return null;
        }
        MyTreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
