package com.leetcode.algorithm.medium.maxancestordiff;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(8);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(6);
    root.left.right.left = new TreeNode(4);
    root.left.right.right = new TreeNode(7);
    root.right = new TreeNode(10);
    root.right.right = new TreeNode(14);
    root.right.right.left = new TreeNode(13);
    assertEquals(7, solution.maxAncestorDiff(root));
  }
}
