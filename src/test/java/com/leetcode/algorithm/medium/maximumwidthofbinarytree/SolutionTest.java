package com.leetcode.algorithm.medium.maximumwidthofbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(9);
    assertEquals(4, solution.widthOfBinaryTree(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    assertEquals(2, solution.widthOfBinaryTree(root));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.right = new TreeNode(2);
    assertEquals(2, solution.widthOfBinaryTree(root));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.left.left = new TreeNode(6);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(9);
    root.right.right.right = new TreeNode(7);
    assertEquals(8, solution.widthOfBinaryTree(root));
  }
}
