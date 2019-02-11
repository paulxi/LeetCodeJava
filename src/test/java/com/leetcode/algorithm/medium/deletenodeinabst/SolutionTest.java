package com.leetcode.algorithm.medium.deletenodeinabst;

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
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.right = new TreeNode(7);

    TreeNode expected = new TreeNode(5);
    expected.left = new TreeNode(4);
    expected.left.left = new TreeNode(2);
    expected.right = new TreeNode(6);
    expected.right.right = new TreeNode(7);

    assertEquals(expected, solution.deleteNode(root, 3));
  }
}
