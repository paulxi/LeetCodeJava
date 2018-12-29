package com.leetcode.algorithm.medium.removenthnodefromendoflist;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode first = dummy;
    ListNode second = dummy;
    for (int i = 0; i <= n; i++) {
      first = first.next;
    }

    while (first != null) {
      first = first.next;
      second = second.next;
    }

    second.next = second.next.next;

    return dummy.next;
  }
}
