package com.leetcode.algorithm.medium.rangesumofbst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(7);
    root.right = new TreeNode(15);
    root.right.right = new TreeNode(18);

    assertEquals(32, solution.rangeSumBST(root, 7, 15));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(5);
    root.left.left = new TreeNode(3);
    root.left.left.left = new TreeNode(1);
    root.left.right = new TreeNode(7);
    root.left.right.left = new TreeNode(6);
    root.right = new TreeNode(15);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(18);

    assertEquals(23, solution.rangeSumBST(root, 6, 10));
  }
}
