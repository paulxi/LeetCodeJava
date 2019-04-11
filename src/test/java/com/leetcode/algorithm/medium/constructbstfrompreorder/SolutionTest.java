package com.leetcode.algorithm.medium.constructbstfrompreorder;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(8);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(10);
    root.right.right = new TreeNode(12);

    assertEquals(root, solution.bstFromPreorder(new int[] {8, 5, 1, 7, 10, 12}));
  }
}
