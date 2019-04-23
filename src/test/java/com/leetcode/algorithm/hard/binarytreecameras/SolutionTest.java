package com.leetcode.algorithm.hard.binarytreecameras;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(0);

    assertEquals(1, solution.minCameraCover(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(0);
    root.left = new TreeNode(0);
    root.left.left = new TreeNode(0);
    root.left.left.left = new TreeNode(0);
    root.left.left.left.right = new TreeNode(0);

    assertEquals(2, solution.minCameraCover(root));
  }
}
