package com.leetcode.algorithm.medium.binarytreelongestconsecutivesequenceii;

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
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    assertEquals(2, solution.longestConsecutive(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);

    assertEquals(3, solution.longestConsecutive(root));
  }
}
