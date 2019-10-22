package com.leetcode.algorithm.medium.maximumaveragesubtree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(6);
    root.right = new TreeNode(1);

    Solution solution = new Solution();
    assertEquals(6.0, solution.maximumAverageSubtree(root), 0.01);
  }
}
