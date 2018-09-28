package com.leetcode.algorithm.hard.mergeksortedlists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testMatchingCase1() {
    Solution solution = new Solution();

    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(5);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode l3 = new ListNode(2);
    l3.next = new ListNode(6);

    ListNode expect = new ListNode(1);
    expect.next = new ListNode(1);
    expect.next.next = new ListNode(2);
    expect.next.next.next = new ListNode(3);
    expect.next.next.next.next = new ListNode(4);
    expect.next.next.next.next.next = new ListNode(4);
    expect.next.next.next.next.next.next = new ListNode(5);
    expect.next.next.next.next.next.next.next = new ListNode(6);

    assertEquals(expect, solution.mergeKLists(new ListNode[]{l1, l2, l3}));
  }
}
