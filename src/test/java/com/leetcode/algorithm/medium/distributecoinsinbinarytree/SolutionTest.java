package com.leetcode.algorithm.medium.distributecoinsinbinarytree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);

    assertEquals(2, solution.distributeCoins(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(3);
    root.right = new TreeNode(0);

    assertEquals(3, solution.distributeCoins(root));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(2);

    assertEquals(2, solution.distributeCoins(root));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(0);

    assertEquals(4, solution.distributeCoins(root));
  }
}
