package com.leetcode.algorithm.easy.balancedbinarytree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    assertEquals(true, solution.isBalanced(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(4);
    root.left.left.right = new TreeNode(4);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(2);

    assertEquals(false, solution.isBalanced(root));
  }
}
