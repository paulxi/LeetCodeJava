package com.leetcode.algorithm.easy.invertbinarytree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);

    root.right = new TreeNode(7);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(9);

    TreeNode expected = new TreeNode(4);
    expected.left = new TreeNode(7);
    expected.left.left = new TreeNode(9);
    expected.left.right = new TreeNode(6);

    expected.right = new TreeNode(2);
    expected.right.left = new TreeNode(3);
    expected.right.right = new TreeNode(1);

    assertEquals(expected, solution.invertTree(root));
  }
}
