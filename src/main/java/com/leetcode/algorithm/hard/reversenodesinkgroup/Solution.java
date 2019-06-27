package com.leetcode.algorithm.hard.reversenodesinkgroup;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode node = head;
    int count = 0;
    while (node != null) {
      node = node.next;
      count++;
    }

    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;
    while (count >= k) {
      ListNode curr = prev.next;
      ListNode next = curr.next;
      for (int i = 1; i < k; i++) {
        curr.next = next.next;
        next.next = prev.next;
        prev.next = next;
        next = curr.next;
      }
      prev = curr;
      count -= k;
    }

    return dummy.next;
  }
}
