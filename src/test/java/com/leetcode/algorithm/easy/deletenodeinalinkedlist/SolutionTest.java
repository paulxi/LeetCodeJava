package com.leetcode.algorithm.easy.deletenodeinalinkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testShouldReturnFalse() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(4);
    listNode.next = new ListNode(5);
    listNode.next.next = new ListNode(1);
    listNode.next.next.next = new ListNode(9);

    solution.deleteNode(listNode.next);

    ListNode expected = new ListNode(4);
    expected.next = new ListNode(1);
    expected.next.next = new ListNode(9);

    assertEquals(expected, listNode);
  }

  @Test
  public void testShouldReturnTrue() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(4);
    listNode.next = new ListNode(5);
    listNode.next.next = new ListNode(1);
    listNode.next.next.next = new ListNode(9);

    solution.deleteNode(listNode.next.next);

    ListNode expected = new ListNode(4);
    expected.next = new ListNode(5);
    expected.next.next = new ListNode(9);

    assertEquals(expected, listNode);
  }
}
