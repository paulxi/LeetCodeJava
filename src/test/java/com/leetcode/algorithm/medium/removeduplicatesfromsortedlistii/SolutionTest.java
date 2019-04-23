package com.leetcode.algorithm.medium.removeduplicatesfromsortedlistii;

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
    listNode.next.next.next = new ListNode(3);
    listNode.next.next.next.next = new ListNode(4);
    listNode.next.next.next.next.next = new ListNode(4);
    listNode.next.next.next.next.next.next = new ListNode(5);

    ListNode expected = new ListNode(1);
    expected.next = new ListNode(2);
    expected.next.next = new ListNode(5);

    assertEquals(expected, solution.deleteDuplicates(listNode));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(1);
    listNode.next.next = new ListNode(1);
    listNode.next.next.next = new ListNode(2);
    listNode.next.next.next.next = new ListNode(3);

    ListNode expected = new ListNode(2);
    expected.next = new ListNode(3);

    assertEquals(expected, solution.deleteDuplicates(listNode));
  }
}
