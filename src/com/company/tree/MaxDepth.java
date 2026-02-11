package com.company.tree;


import com.company.tree.bst.BST;
import com.company.tree.bst.MyTreeNode;

public class MaxDepth {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(3);
        bst.insert(9);
        bst.insert(90);
        bst.insert(91);



        System.out.println(maxDepth(bst.getRoot()));
    }


    public static int maxDepth(MyTreeNode root) {
        // code here
        if(root == null){
            return 0;
        }
        int lH = maxDepth(root.left);
        int rH = maxDepth(root.right);
        return Math.max(lH, rH) + 1;
    }
}
