package com.leetcode.algorithm.easy.longestunivaluepath;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(1);

    root.right = new TreeNode(5);
    root.right.right = new TreeNode(5);

    Solution solution = new Solution();
    assertEquals(2, solution.longestUnivaluePath(root));
  }

  @Test
  public void testCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(4);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(4);

    root.right = new TreeNode(5);
    root.right.right = new TreeNode(5);

    Solution solution = new Solution();
    assertEquals(2, solution.longestUnivaluePath(root));
  }
}
