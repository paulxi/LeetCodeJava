package com.leetcode.algorithm.medium.flattenbinarytreetolinkedlist;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.right = new TreeNode(5);
    root.right.right = new TreeNode(6);

    solution.flatten(root);

    TreeNode expteced = new TreeNode(1);
    expteced.right = new TreeNode(2);
    expteced.right.right = new TreeNode(3);
    expteced.right.right.right = new TreeNode(4);
    expteced.right.right.right.right = new TreeNode(5);
    expteced.right.right.right.right.right = new TreeNode(6);

    assertEquals(expteced, root);
  }
}
