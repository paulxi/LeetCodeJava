package com.leetcode.algorithm.medium.binarytreezigzaglevelordertraversal;

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

    assertEquals(Arrays.asList(Arrays.asList(3), Arrays.asList(20, 9), Arrays.asList(15, 7)),
        solution.zigzagLevelOrder(root));
  }
}
