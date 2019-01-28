package com.leetcode.algorithm.medium.populatingnextrightpointersineachnodeii;

import com.leetcode.algorithm.common.TreeLinkNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeLinkNode head = new TreeLinkNode(1);
    head.left = new TreeLinkNode(2);
    head.left.left = new TreeLinkNode(4);
    head.left.right = new TreeLinkNode(5);
    head.right = new TreeLinkNode(3);
    head.right.right = new TreeLinkNode(7);

    TreeLinkNode expected = new TreeLinkNode(1);
    expected.left = new TreeLinkNode(2);
    expected.left.left = new TreeLinkNode(4);
    expected.left.right = new TreeLinkNode(5);
    expected.right = new TreeLinkNode(3);
    expected.right.right = new TreeLinkNode(7);
    expected.left.next = expected.right;
    expected.left.left.next = expected.left.right;
    expected.left.right.next = expected.right.right;

    solution.connect(head);
    assertEquals(expected, head);
  }
}
