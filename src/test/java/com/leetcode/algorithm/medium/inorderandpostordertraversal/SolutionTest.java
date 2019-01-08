package com.leetcode.algorithm.medium.inorderandpostordertraversal;

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

    TreeNode result = solution.buildTree(new int[] {9, 3, 15, 20, 7}, new int[] {9, 15, 7, 20, 3});
    assertEquals(root, result);
  }
}
