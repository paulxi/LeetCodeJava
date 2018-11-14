package com.leetcode.algorithm.medium.linkedlistcycleii;

import com.leetcode.algorithm.common.ListNode;

public class Solution {
  public ListNode detectCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;

    ListNode intersect = null;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        intersect = slow;
        break;
      }
    }

    if (intersect == null) {
      return null;
    }

    ListNode ptr = head;
    while (ptr != intersect) {
      ptr = ptr.next;
      intersect = intersect.next;
    }

    return ptr;
  }
}
