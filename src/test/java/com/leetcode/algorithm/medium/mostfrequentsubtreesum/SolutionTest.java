package com.leetcode.algorithm.medium.mostfrequentsubtreesum;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(-3);

    Solution solution = new Solution();
    assertArrayEquals(new int[] {2, -3, 4}, solution.findFrequentTreeSum(root));
  }

  @Test
  public void testCase2() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(-5);

    Solution solution = new Solution();
    assertArrayEquals(new int[] {2}, solution.findFrequentTreeSum(root));
  }
}
