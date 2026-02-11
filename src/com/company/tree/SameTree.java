package com.company.tree;

import com.company.tree.bst.BST;
import com.company.tree.bst.MyTreeNode;

public class SameTree {
    public static void main(String[] args) {

        BST bst = new BST();
        bst.insert(3);
        bst.insert(9);
        bst.insert(90);
        bst.insert(91);
        BST bst2 = new BST();
        bst2.insert(3);
        bst2.insert(9);
        bst2.insert(90);
        bst2.insert(91);
        System.out.println(isSameTree(bst.getRoot(), bst2.getRoot()));
    }

    public static boolean isSameTree(MyTreeNode p, MyTreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.getValue() != q.getValue()) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
