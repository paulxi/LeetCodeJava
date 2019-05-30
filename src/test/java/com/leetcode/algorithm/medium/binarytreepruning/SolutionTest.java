package com.leetcode.algorithm.medium.binarytreepruning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);

    TreeNode expected = new TreeNode(1);
    expected.right = new TreeNode(0);
    expected.right.right = new TreeNode(1);
    assertEquals(expected, solution.pruneTree(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(0);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);

    TreeNode expected = new TreeNode(1);
    expected.right = new TreeNode(1);
    expected.right.right = new TreeNode(1);
    assertEquals(expected, solution.pruneTree(root));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.left.left = new TreeNode(0);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(0);
    root.right.left = new TreeNode(0);
    root.right.right = new TreeNode(1);

    TreeNode expected = new TreeNode(1);
    expected.left = new TreeNode(1);
    expected.left.left = new TreeNode(1);
    expected.left.right = new TreeNode(1);
    expected.right = new TreeNode(0);
    expected.right.right = new TreeNode(1);
    assertEquals(expected, solution.pruneTree(root));
  }
}
