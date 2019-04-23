package com.leetcode.algorithm.medium.nextgreaternodeinlinkedlist;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    ListNode head = new ListNode(2);
    head.next = new ListNode(1);
    head.next.next = new ListNode(5);
    assertArrayEquals(new int[] {5, 5, 0}, solution.nextLargerNodes(head));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    ListNode head = new ListNode(2);
    head.next = new ListNode(7);
    head.next.next = new ListNode(4);
    head.next.next.next = new ListNode(3);
    head.next.next.next.next = new ListNode(5);
    assertArrayEquals(new int[] {7, 0, 5, 5, 0}, solution.nextLargerNodes(head));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(7);
    head.next.next = new ListNode(5);
    head.next.next.next = new ListNode(1);
    head.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next.next.next = new ListNode(1);
    assertArrayEquals(new int[] {7, 9, 9, 9, 0, 5, 0, 0}, solution.nextLargerNodes(head));
  }
}
