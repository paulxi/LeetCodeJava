package com.leetcode.algorithm.easy.mergetwosortedlists;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    } else {
      ListNode node1 = l1;
      ListNode node2 = l2;
      ListNode result = new ListNode(0);
      ListNode ptr = result;

      while (node1 != null && node2 != null) {
        int value = node1.val <= node2.val ? node1.val : node2.val;
        ptr.next = new ListNode(value);
        ptr = ptr.next;

        if (node1.val <= node2.val) {
          node1 = node1.next;
        } else {
          node2 = node2.next;
        }
      }

      if (node1 != null) {
        ptr.next = node1;
      }
      if (node2 != null) {
        ptr.next = node2;
      }

      return result.next;
    }
  }
}
