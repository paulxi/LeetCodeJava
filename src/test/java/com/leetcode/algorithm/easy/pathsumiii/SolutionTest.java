package com.leetcode.algorithm.easy.pathsumiii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(3);
    root.left.left.right = new TreeNode(-2);
    root.left.right = new TreeNode(2);
    root.left.right.right = new TreeNode(1);
    root.right = new TreeNode(-3);
    root.right.right = new TreeNode(11);

    assertEquals(3, solution.pathSum(root, 8));
  }
}
