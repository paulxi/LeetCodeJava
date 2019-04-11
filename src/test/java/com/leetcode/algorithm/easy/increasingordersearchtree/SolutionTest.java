package com.leetcode.algorithm.easy.increasingordersearchtree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.left.left = new TreeNode(1);
    root.left.right = new TreeNode(4);

    root.right = new TreeNode(6);
    root.right.right = new TreeNode(8);
    root.right.right.left = new TreeNode(7);
    root.right.right.right = new TreeNode(9);

    TreeNode expected = new TreeNode(1);
    expected.right = new TreeNode(2);
    expected.right.right = new TreeNode(3);
    expected.right.right.right = new TreeNode(4);
    expected.right.right.right.right = new TreeNode(5);
    expected.right.right.right.right.right = new TreeNode(6);
    expected.right.right.right.right.right.right = new TreeNode(7);
    expected.right.right.right.right.right.right.right = new TreeNode(8);
    expected.right.right.right.right.right.right.right.right = new TreeNode(9);


    assertEquals(expected, solution.increasingBST(root));
  }
}
