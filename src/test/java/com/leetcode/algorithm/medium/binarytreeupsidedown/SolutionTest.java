package com.leetcode.algorithm.medium.binarytreeupsidedown;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);

    TreeNode expected = new TreeNode(4);
    expected.left = new TreeNode(5);
    expected.right = new TreeNode(2);
    expected.right.left = new TreeNode(3);
    expected.right.right = new TreeNode(1);

    assertEquals(expected, solution.upsideDownBinaryTree(root));
  }
}
