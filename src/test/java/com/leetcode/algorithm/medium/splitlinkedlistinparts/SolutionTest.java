package com.leetcode.algorithm.medium.splitlinkedlistinparts;

import com.leetcode.algorithm.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    assertArrayEquals(new ListNode[] {new ListNode(1),
        new ListNode(2),
        new ListNode(3),
        null, null},
        solution.splitListToParts(head, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = new ListNode(7);
    head.next.next.next.next.next.next.next = new ListNode(8);
    head.next.next.next.next.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next.next.next.next.next = new ListNode(10);


    ListNode node1 = new ListNode(1);
    node1.next = new ListNode(2);
    node1.next.next = new ListNode(3);
    node1.next.next.next = new ListNode(4);

    ListNode node2 = new ListNode(5);
    node2.next = new ListNode(6);
    node2.next.next = new ListNode(7);

    ListNode node3 = new ListNode(8);
    node3.next = new ListNode(9);
    node3.next.next = new ListNode(10);

    assertArrayEquals(new ListNode[] {node1, node2, node3}, solution.splitListToParts(head, 3));
  }
}
