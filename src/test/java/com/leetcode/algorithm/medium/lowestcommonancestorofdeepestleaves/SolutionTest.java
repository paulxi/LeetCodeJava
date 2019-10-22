package com.leetcode.algorithm.medium.lowestcommonancestorofdeepestleaves;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    Solution solution = new Solution();
    assertEquals(root, solution.lcaDeepestLeaves(root));
  }

  @Test
  public void testCase2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);

    Solution solution = new Solution();
    assertEquals(root.left.left, solution.lcaDeepestLeaves(root));
  }

  @Test
  public void testCase3() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);

    Solution solution = new Solution();
    assertEquals(root.left, solution.lcaDeepestLeaves(root));
  }
}
