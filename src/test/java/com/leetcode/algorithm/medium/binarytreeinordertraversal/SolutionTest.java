package com.leetcode.algorithm.medium.binarytreeinordertraversal;

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
    assertEquals(Arrays.asList(1, 3, 2), solution.inorderTraversal(root));
  }
}
