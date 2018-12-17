package com.leetcode.algorithm.easy.secondminimumnodeinabinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    assertEquals(5, solution.findSecondMinimumValue(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.right = new TreeNode(2);
    assertEquals(-1, solution.findSecondMinimumValue(root));
  }
}
