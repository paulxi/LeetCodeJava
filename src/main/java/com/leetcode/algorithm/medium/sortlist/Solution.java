package com.leetcode.algorithm.medium.sortlist;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    // step 1. cut the list to two halves
    ListNode prev = null;
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      prev = slow;
      slow = slow.next;
      fast = fast.next.next;
    }

    prev.next = null;

    // step 2. sort each half
    ListNode l1 = sortList(head);
    ListNode l2 = sortList(slow);

    // step 3. merge l1 and l2
    return merge(l1, l2);
  }

  private ListNode merge(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        prev.next = l1;
        l1 = l1.next;
      } else {
        prev.next = l2;
        l2 = l2.next;
      }

      prev = prev.next;
    }

    if (l1 != null) {
      prev.next = l1;
    }

    if (l2 != null) {
      prev.next = l2;
    }

    return dummy.next;
  }
}
