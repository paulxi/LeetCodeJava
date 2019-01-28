package com.leetcode.algorithm.medium.splitlinkedlistinparts;

import com.leetcode.algorithm.common.ListNode;

class Solution {
  public ListNode[] splitListToParts(ListNode root, int k) {
    ListNode[] ans = new ListNode[k];

    int count = 0;
    ListNode curr = root;
    while (curr != null) {
      curr = curr.next;
      count++;
    }

    curr = root;

    for (int i = 0; i < ans.length; i++) {
      ans[i] = curr;

      int len = count / k;
      if (count % k > i) {
        len++;
      }

      while (len > 0) {
        if (curr != null) {
          ListNode prev = curr;
          curr = curr.next;
          len--;
          if (len == 0) {
            prev.next = null;
          }
        } else {
          break;
        }
      }

      if (len > 0) {
        break;
      }
    }

    return ans;
  }
}
