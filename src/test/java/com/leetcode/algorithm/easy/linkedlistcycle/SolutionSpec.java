package com.leetcode.algorithm.easy.linkedlistcycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionSpec {
  @Test
  public void testShouldReturnFalse() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(3);
    listNode.next.next.next = new ListNode(4);
    listNode.next.next.next.next = new ListNode(5);

    assertEquals(false, solution.hasCycle(listNode));
  }

  @Test
  public void testShouldReturnTrue() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(2);
    listNode.next.next = new ListNode(3);
    listNode.next.next.next = new ListNode(4);
    listNode.next.next.next.next = listNode;

    assertEquals(true, solution.hasCycle(listNode));
  }
}
