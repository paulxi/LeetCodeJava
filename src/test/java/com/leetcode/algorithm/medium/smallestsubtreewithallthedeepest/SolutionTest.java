package com.leetcode.algorithm.medium.smallestsubtreewithallthedeepest;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(6);
    root.left.right = new TreeNode(2);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(4);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(8);

    assertEquals(root.left.right, solution.subtreeWithAllDeepest(root));
  }
}
