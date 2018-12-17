package com.leetcode.algorithm.medium.maximumbinarytree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(3);
    root.left.right = new TreeNode(2);
    root.left.right.right = new TreeNode(1);
    root.right = new TreeNode(5);
    root.right.left = new TreeNode(0);

    Solution solution = new Solution();
    assertEquals(root, solution.constructMaximumBinaryTree(new int[] {3, 2, 1, 6, 0, 5}));
  }
}
