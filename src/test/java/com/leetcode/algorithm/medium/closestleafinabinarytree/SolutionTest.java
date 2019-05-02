package com.leetcode.algorithm.medium.closestleafinabinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    assertEquals(2, solution.findClosestLeaf(root, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);

    assertEquals(1, solution.findClosestLeaf(root, 1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(5);
    root.left.left.left.left = new TreeNode(6);
    root.right = new TreeNode(3);

    assertEquals(3, solution.findClosestLeaf(root, 2));
  }
}
