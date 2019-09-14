package com.leetcode.algorithm.medium.binarytreecoloringgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.left.left = new TreeNode(8);
    root.left.left.right = new TreeNode(9);
    root.left.right = new TreeNode(5);
    root.left.right.left = new TreeNode(10);
    root.left.right.right = new TreeNode(11);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);
    assertEquals(true, solution.btreeGameWinningMove(root, 11, 3));
  }
}
