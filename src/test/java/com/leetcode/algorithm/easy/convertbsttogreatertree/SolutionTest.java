package com.leetcode.algorithm.easy.convertbsttogreatertree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(13);

    TreeNode expected = new TreeNode(18);
    expected.left = new TreeNode(20);
    expected.right = new TreeNode(13);

    assertEquals(expected, solution.convertBST(root));
  }
}
