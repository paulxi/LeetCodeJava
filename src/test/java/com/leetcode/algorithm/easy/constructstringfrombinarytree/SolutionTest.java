package com.leetcode.algorithm.easy.constructstringfrombinarytree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);

    assertEquals("1(2(4))(3)", solution.tree2str(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(3);

    assertEquals("1(2()(4))(3)", solution.tree2str(root));
  }
}
