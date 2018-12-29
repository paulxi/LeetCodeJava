package com.leetcode.algorithm.medium.binarytreeverticalordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    assertEquals(Arrays.asList(Arrays.asList(9), Arrays.asList(3, 15), Arrays.asList(20), Arrays.asList(7)),
        solution.verticalOrder(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(0);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(1);
    root.right.right = new TreeNode(7);

    assertEquals(Arrays.asList(Arrays.asList(4), Arrays.asList(9), Arrays.asList(3, 0, 1), Arrays.asList(8), Arrays.asList(7)),
        solution.verticalOrder(root));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(0);
    root.left.right.right = new TreeNode(2);
    root.right = new TreeNode(8);
    root.right.left = new TreeNode(1);
    root.right.left.left = new TreeNode(5);
    root.right.right = new TreeNode(7);

    assertEquals(Arrays.asList(Arrays.asList(4), Arrays.asList(9, 5), Arrays.asList(3, 0, 1), Arrays.asList(8, 2), Arrays.asList(7)),
        solution.verticalOrder(root));
  }
}
