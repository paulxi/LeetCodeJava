package com.leetcode.algorithm.medium.countunivaluesubtrees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(5);

    assertEquals(4, solution.countUnivalSubtrees(root));
  }
}
