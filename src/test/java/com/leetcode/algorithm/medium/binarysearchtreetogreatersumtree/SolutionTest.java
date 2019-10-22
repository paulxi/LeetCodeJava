package com.leetcode.algorithm.medium.binarysearchtreetogreatersumtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import com.leetcode.algorithm.common.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(2);
    root.left.right.right = new TreeNode(3);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    root.right.right.right = new TreeNode(8);

    TreeNode expected = new TreeNode(30);
    expected.left = new TreeNode(36);
    expected.left.left = new TreeNode(36);
    expected.left.right = new TreeNode(35);
    expected.left.right.right = new TreeNode(33);
    expected.right = new TreeNode(21);
    expected.right.left = new TreeNode(26);
    expected.right.right = new TreeNode(15);
    expected.right.right.right = new TreeNode(8);

    assertEquals(expected, solution.bstToGst(root));
  }
}
