package com.company.leetcode.level1;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode n = new ListNode();
    
        System.out.println(n.next);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1 = list1;
        ListNode n2 = list2;
        ListNode currentNode = null;
        ListNode result = null;
        
        if(n1.val > n2.val){
            result = new ListNode(n2.val );
            n2 = n2.next;

        }else{
            result = new ListNode(n1.val);
            n1 = n1.next;
            currentNode = result;
        }
        while (n1.next != null || n2.next != null) {
            
            if(n1.next == null){
                currentNode = new ListNode(n2.val , n2);
            }else{
                
            }
            if (n1.val > n2.val) {
                result.next = n2;
                n2 = n2.next;
            } else {
                result.next = n1;
                n1 = n1.next;
            }
        }
        return result;
    }

}
