package com.leetcode.algorithm.medium.swapnodesinpairs;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;
    ListNode curr = head;
    ListNode then = head.next;

    while (curr != null && then != null) {
      ListNode temp = then.next;

      prev.next = then;
      then.next = curr;
      curr.next = temp;

      prev = curr;
      curr = temp;
      if (temp != null && temp.next != null) {
        then = temp.next;
      } else {
        then = null;
      }
    }

    return dummy.next;
  }
}
