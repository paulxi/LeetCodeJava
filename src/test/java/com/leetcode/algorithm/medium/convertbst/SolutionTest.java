package com.leetcode.algorithm.medium.convertbst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(5);

    TreeNode expected = new TreeNode(1);
    expected.right = new TreeNode(2);
    expected.right.left = expected;
    expected.right.right = new TreeNode(3);
    expected.right.right.left = expected.right;
    expected.right.right.right = new TreeNode(4);
    expected.right.right.right.left = expected.right.right;
    expected.right.right.right.right = new TreeNode(5);
    expected.right.right.right.right.left = expected.right.right.right;
    expected.right.right.right.right.right = new TreeNode(1);
    expected.left = expected.right.right.right.right.right;

    assertEquals(true,
        solution.treeToDoublyList(root) != null);
  }
}
