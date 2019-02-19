package com.leetcode.algorithm.easy.twosumiv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);
    assertEquals(true, solution.findTarget(root, 9));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);
    assertEquals(false, solution.findTarget(root, 28));
  }
}
