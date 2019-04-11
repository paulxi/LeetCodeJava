package com.leetcode.algorithm.medium.convertsortedlisttobst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.ListNode;
import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    ListNode head = new ListNode(-10);
    head.next = new ListNode(-3);
    head.next.next = new ListNode(0);
    head.next.next.next = new ListNode(5);
    head.next.next.next.next = new ListNode(9);

    TreeNode expected = new TreeNode(0);
    expected.left = new TreeNode(-3);
    expected.left.left = new TreeNode(-10);
    expected.right = new TreeNode(9);
    expected.right.left = new TreeNode(5);

    assertEquals(expected, solution.sortedListToBST(head));
  }
}
