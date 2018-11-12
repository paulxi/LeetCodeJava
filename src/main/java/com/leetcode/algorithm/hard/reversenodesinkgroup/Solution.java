package com.leetcode.algorithm.hard.reversenodesinkgroup;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode curr = head;
    ListNode ansHead = null;
    ListNode ansCurr = null;
    while (curr != null) {
      ListNode ptr = curr;

      int count = 0;

      while (curr != null && count != k) {
        curr = curr.next;
        count += 1;
      }

      if (count == k) {
        ListNode prev = null;
        while (count > 0) {
          ListNode temp = ptr.next;
          ptr.next = prev;
          prev = ptr;
          ptr = temp;

          count -= 1;
        }

        if (ansHead != null) {
          ansCurr.next = prev;
        } else {
          ansHead = prev;
          ansCurr = ansHead;
        }
      } else {
        if (ansHead != null) {
          ansCurr.next = ptr;
        } else {
          ansHead = ptr;
          ansCurr = ansHead;
        }
      }

      while (ansCurr.next != null) {
        ansCurr = ansCurr.next;
      }
    }

    return ansHead;
  }
}
