package com.leetcode.algorithm.easy.mergetwosortedlists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode expected = new ListNode(1);
    expected.next = new ListNode(1);
    expected.next.next = new ListNode(2);
    expected.next.next.next = new ListNode(3);
    expected.next.next.next.next = new ListNode(4);
    expected.next.next.next.next.next = new ListNode(4);

    assertEquals(expected, solution.mergeTwoLists(l1, l2));
  }
}
