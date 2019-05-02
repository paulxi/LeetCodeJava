package com.leetcode.algorithm.medium.linkedlListcomponents;

import com.leetcode.algorithm.common.ListNode;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int numComponents(ListNode head, int[] g) {
    Set<Integer> set = new HashSet<>();
    for (int i: g) {
      set.add(i);
    }

    int ans = 0;
    while (head != null) {
      if (set.contains(head.val) && (head.next == null || !set.contains(head.next.val))) {
        ans++;
      }
      head = head.next;
    }

    return ans;
  }
}
