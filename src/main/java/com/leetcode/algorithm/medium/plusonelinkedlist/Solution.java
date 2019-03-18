package com.leetcode.algorithm.medium.plusonelinkedlist;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode plusOne(ListNode head) {
    int result = dfs(head);
    if (result == 0) {
      return head;
    } else {
      ListNode newHead = new ListNode(1);
      newHead.next = head;
      return newHead;
    }
  }

  private int dfs(ListNode node) {
    if (node == null) {
      return 1;
    }

    int carry = dfs(node.next);
    if (carry == 0) {
      return 0;
    }

    int val = node.val + 1;
    node.val = val % 10;
    return val / 10;
  }
}
