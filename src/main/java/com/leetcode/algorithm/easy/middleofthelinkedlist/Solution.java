package com.leetcode.algorithm.easy.middleofthelinkedlist;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode middleNode(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }
}
