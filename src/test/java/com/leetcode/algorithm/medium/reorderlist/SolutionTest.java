package com.leetcode.algorithm.medium.reorderlist;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);


    ListNode expected = new ListNode(1);
    expected.next = new ListNode(4);
    expected.next.next = new ListNode(2);
    expected.next.next.next = new ListNode(3);
    solution.reorderList(head);
    assertEquals(expected, head);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);


    ListNode expected = new ListNode(1);
    expected.next = new ListNode(5);
    expected.next.next = new ListNode(2);
    expected.next.next.next = new ListNode(4);
    expected.next.next.next.next = new ListNode(3);
    solution.reorderList(head);
    assertEquals(expected, head);
  }
}
