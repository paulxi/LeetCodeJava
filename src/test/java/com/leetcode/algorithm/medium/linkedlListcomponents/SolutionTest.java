package com.leetcode.algorithm.medium.linkedlListcomponents;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(0);
    listNode.next = new ListNode(1);
    listNode.next.next = new ListNode(2);
    listNode.next.next.next = new ListNode(3);

    assertEquals(2, solution.numComponents(listNode, new int[] {0, 1, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(0);
    listNode.next = new ListNode(1);
    listNode.next.next = new ListNode(2);
    listNode.next.next.next = new ListNode(3);
    listNode.next.next.next.next = new ListNode(4);

    assertEquals(2, solution.numComponents(listNode, new int[] {0, 3, 1, 4}));
  }
}
