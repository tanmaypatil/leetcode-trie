package com.example.basic.heap;

import java.util.PriorityQueue;

public class Problem23 {
    PriorityQueue<Integer> q  = new PriorityQueue<Integer>();
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if ( lists == null || lists.length == 0 ) return null;
        for(int i = 0 ; i < lists.length ; i++){
            ListNode l = lists[i];
            while (l != null) {
                q.add(l.val);
                l = l.next;
            }
        }
        ListNode head = null;
        ListNode last = null ;
        while(q.peek() != null) {
            ListNode l = new ListNode();
            l.val = q.remove();
            if( head == null) {
                head = last = l;
            }
            else {
                last.next = l ;
                last = l;
            }   
        } 
        return head;

    }
}
