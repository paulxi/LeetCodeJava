package com.leetcode.algorithm.easy.intersectionoftwolinkedlists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    ListNode headA = new ListNode(1);
    headA.next = new ListNode(2);
    headA.next.next = new ListNode(3);
    headA.next.next = new ListNode(4);
    headA.next.next = new ListNode(5);

    ListNode headB = new ListNode(6);
    headB.next = new ListNode(7);
    headB.next.next = new ListNode(8);
    headB.next.next.next = headA.next.next;


    assertEquals(headA.next.next, solution.getIntersectionNode(headA, headB));
  }
}
