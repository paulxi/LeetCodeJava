package com.leetcode.algorithm.medium.addtwonumbersii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    ListNode l1 = new ListNode(7);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);
    l1.next.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode expect = new ListNode(7);
    expect.next = new ListNode(8);
    expect.next.next = new ListNode(0);
    expect.next.next.next = new ListNode(7);

    Solution solution = new Solution();
    assertEquals(expect, solution.addTwoNumbers(l1, l2));
  }
}

