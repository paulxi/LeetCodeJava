package com.leetcode.algorithm.easy.removelinkedlistelements;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;

    ListNode cur = head;
    ListNode prev = dummy;
    while (cur != null) {
      if (cur.val == val) {
        prev.next = cur.next;
      } else {
        prev = cur;
      }
      cur = cur.next;
    }

    return dummy.next;
  }
}
