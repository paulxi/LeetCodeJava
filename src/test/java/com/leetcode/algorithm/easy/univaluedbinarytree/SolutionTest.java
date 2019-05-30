package com.leetcode.algorithm.easy.univaluedbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(1);
    root.right.right = new TreeNode(1);
    assertEquals(true, solution.isUnivalTree(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(2);
    assertEquals(false, solution.isUnivalTree(root));
  }
}
