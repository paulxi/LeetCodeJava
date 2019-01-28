package com.leetcode.algorithm.easy.convertsortedarraytobinarysearchtree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode expected = new TreeNode(0);
    expected.left = new TreeNode(-10);
    expected.left.right = new TreeNode(-3);
    expected.right = new TreeNode(5);
    expected.right.right = new TreeNode(9);

    assertEquals(expected, solution.sortedArrayToBST(new int[] {-10, -3, 0, 5, 9}));
  }
}
