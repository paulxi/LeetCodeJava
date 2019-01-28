package com.leetcode.algorithm.medium.kthsmallestelementinabst;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(1);
    root.left.right = new TreeNode(2);
    root.right = new TreeNode(4);

    Solution solution = new Solution();
    assertEquals(1, solution.kthSmallest(root, 1));
  }

  @Test
  public void testCase2() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(2);
    root.left.left.left = new TreeNode(1);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(6);

    Solution solution = new Solution();
    assertEquals(3, solution.kthSmallest(root, 3));
  }
}
