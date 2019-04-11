package com.leetcode.algorithm.medium.binarytreelongestconsecutivesequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    root.right.right = new TreeNode(4);
    root.right.right.right = new TreeNode(5);

    assertEquals(3, solution.longestConsecutive(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    root.right.left.left = new TreeNode(1);

    assertEquals(2, solution.longestConsecutive(root));
  }
}
