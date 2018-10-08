package com.leetcode.algorithm.easy.linkedlistcycle;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    ListNode slow = head;
    ListNode fast = head.next;

    while (slow != fast) {
      if (fast == null || fast.next == null) {
        return false;
      }

      slow = slow.next;
      fast = fast.next.next;
    }

    return true;
  }
}
