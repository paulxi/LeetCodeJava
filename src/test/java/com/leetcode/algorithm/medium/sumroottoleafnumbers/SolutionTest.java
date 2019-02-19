package com.leetcode.algorithm.medium.sumroottoleafnumbers;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    assertEquals(25, solution.sumNumbers(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(0);

    assertEquals(1026, solution.sumNumbers(root));
  }
}
