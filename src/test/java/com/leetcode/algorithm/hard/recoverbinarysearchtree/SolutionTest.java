package com.leetcode.algorithm.hard.recoverbinarysearchtree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.right = new TreeNode(2);

    TreeNode expected = new TreeNode(3);
    expected.left = new TreeNode(1);
    expected.left.right = new TreeNode(2);

    solution.recoverTree(root);

    assertEquals(expected, root);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(1);
    root.right = new TreeNode(4);
    root.right.left = new TreeNode(2);

    TreeNode expected = new TreeNode(2);
    expected.left = new TreeNode(1);
    expected.right = new TreeNode(4);
    expected.right.left = new TreeNode(3);

    solution.recoverTree(root);

    assertEquals(expected, root);
  }
}
