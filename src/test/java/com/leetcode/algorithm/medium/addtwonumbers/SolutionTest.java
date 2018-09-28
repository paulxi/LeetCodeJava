package com.leetcode.algorithm.medium.addtwonumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testAddTowNumbersOk() {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    ListNode expect = new ListNode(7);
    expect.next = new ListNode(0);
    expect.next.next = new ListNode(8);

    Solution solution = new Solution();
    assertEquals(expect, solution.addTwoNumbers(l1, l2));
  }

  @Test
  public void testAddTowNumbersSingleNodeResult() {
    ListNode l1 = new ListNode(8);

    ListNode l2 = new ListNode(1);

    ListNode expect = new ListNode(9);

    Solution solution = new Solution();

    assertEquals(expect, solution.addTwoNumbers(l1, l2));
  }

  @Test
  public void testAddTowNumbersMultiNodeResult() {
    Solution solution = new Solution();

    ListNode l1 = new ListNode(9);
    ListNode l2 = new ListNode(1);

    ListNode expect = new ListNode(0);
    expect.next = new ListNode(1);

    assertEquals(expect, solution.addTwoNumbers(l1, l2));
  }

  @Test
  public void testAddTowNumbersMultiNodeResultWithMultiNodeInput() {
    ListNode l1 = new ListNode(9);
    l1.next = new ListNode(9);

    ListNode l2 = new ListNode(1);

    ListNode expect = new ListNode(0);
    expect.next = new ListNode(0);
    expect.next.next = new ListNode(1);

    Solution solution = new Solution();

    assertEquals(expect, solution.addTwoNumbers(l1, l2));
  }
}
