package com.leetcode.algorithm.medium.linkedlistcycleii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(3);
    listNode.next.next.next = new ListNode(4);
    listNode.next.next.next.next = new ListNode(5);

    assertEquals(null, solution.detectCycle(listNode));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(3);
    listNode.next.next.next = new ListNode(4);
    listNode.next.next.next.next = listNode.next;

    assertEquals(listNode.next, solution.detectCycle(listNode));
  }
}
