package com.leetcode.algorithm.medium.constructbinarytreefrompreorder;

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
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(7);

    assertEquals(
        root,
        solution.constructFromPrePost(
            new int[] {1, 2, 4, 5, 3, 6, 7}, new int[] {4, 5, 2, 6, 7, 3, 1}));
  }
}
