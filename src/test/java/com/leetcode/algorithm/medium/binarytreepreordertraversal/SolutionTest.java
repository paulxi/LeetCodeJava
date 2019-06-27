package com.leetcode.algorithm.medium.binarytreepreordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    assertEquals(Arrays.asList(1, 2, 3), solution.preorderTraversal(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    assertEquals(Arrays.asList(1, 2, 3), solution.preorderTraversal2(root));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    assertEquals(Arrays.asList(1, 2, 3), solution.preorderTraversal3(root));
  }
}
