package com.leetcode.algorithm.medium.maximumlevelsumofabinarytree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(7);
    root.left.left = new TreeNode(7);
    root.left.right = new TreeNode(-8);
    root.right = new TreeNode(0);

    assertEquals(2, solution.maxLevelSum(root));
  }
}
