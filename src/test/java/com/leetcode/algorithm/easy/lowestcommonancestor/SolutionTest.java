package com.leetcode.algorithm.easy.lowestcommonancestor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);

    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);

    Solution solution = new Solution();
    assertEquals(root, solution.lowestCommonAncestor(root, root.left, root.right));
  }

  @Test
  public void testCase2() {
    TreeNode root = new TreeNode(6);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(4);
    root.left.right.left = new TreeNode(3);
    root.left.right.right = new TreeNode(5);

    root.right = new TreeNode(8);
    root.right.left = new TreeNode(7);
    root.right.right = new TreeNode(9);

    Solution solution = new Solution();
    assertEquals(root.left, solution.lowestCommonAncestor(root, root.left, root.left.right));
  }
}
