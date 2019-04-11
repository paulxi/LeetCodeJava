package com.leetcode.algorithm.easy.leafsimilartrees;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    TreeNode root1 = new TreeNode(3);
    root1.left = new TreeNode(5);
    root1.left.left = new TreeNode(6);
    root1.left.right = new TreeNode(2);
    root1.left.right.left = new TreeNode(7);
    root1.left.right.right = new TreeNode(4);
    root1.right = new TreeNode(1);
    root1.right.left = new TreeNode(9);
    root1.right.right = new TreeNode(8);

    TreeNode root2 = new TreeNode(9);
    root2.left = new TreeNode(0);
    root2.left.left = new TreeNode(6);
    root2.left.right = new TreeNode(2);
    root2.left.right.left = new TreeNode(7);
    root2.left.right.right = new TreeNode(4);
    root2.right = new TreeNode(1);
    root2.right.left = new TreeNode(9);
    root2.right.right = new TreeNode(8);

    assertEquals(true, solution.leafSimilar(root1, root2));
  }
}
