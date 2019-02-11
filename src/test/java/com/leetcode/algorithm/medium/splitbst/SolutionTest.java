package com.leetcode.algorithm.medium.splitbst;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);

    TreeNode expected1 = new TreeNode(4);
    expected1.left = new TreeNode(3);
    expected1.right = new TreeNode(6);
    expected1.right.left = new TreeNode(5);
    expected1.right.right = new TreeNode(7);

    TreeNode expected2 = new TreeNode(2);
    expected2.left = new TreeNode(1);

    assertArrayEquals(new TreeNode[] {expected2, expected1}, solution.splitBST(root, 2));
  }
}
