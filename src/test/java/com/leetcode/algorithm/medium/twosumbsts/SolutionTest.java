package com.leetcode.algorithm.medium.twosumbsts;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(2);
    root1.left = new TreeNode(1);
    root1.right = new TreeNode(4);

    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(0);
    root2.right = new TreeNode(3);

    assertTrue(solution.twoSumBSTs(root1, root2, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(0);
    root1.left = new TreeNode(-10);
    root1.right = new TreeNode(10);

    TreeNode root2 = new TreeNode(5);
    root2.left = new TreeNode(1);
    root2.left.left = new TreeNode(0);
    root2.left.right = new TreeNode(2);
    root2.right = new TreeNode(7);

    assertFalse(solution.twoSumBSTs(root1, root2, 18));
  }
}
