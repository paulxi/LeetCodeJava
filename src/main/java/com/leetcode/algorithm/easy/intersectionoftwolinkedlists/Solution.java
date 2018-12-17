package com.leetcode.algorithm.easy.intersectionoftwolinkedlists;

import com.leetcode.algorithm.common.ListNode;

public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode pA = headA, pB = headB;
    while (pA != pB) {
      pA = pA != null ? pA.next : headB;
      pB = pB != null ? pB.next : headA;
    }
    return (pA == pB && pA != null) ? pA : null;
  }
}
