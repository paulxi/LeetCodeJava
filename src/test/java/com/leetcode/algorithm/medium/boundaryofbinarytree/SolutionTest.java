package com.leetcode.algorithm.medium.boundaryofbinarytree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(4);
    assertEquals(Arrays.asList(1, 3, 4, 2), solution.boundaryOfBinaryTree(root));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.right.left = new TreeNode(7);
    root.left.right.right = new TreeNode(8);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(6);
    root.right.left.left = new TreeNode(9);
    root.right.left.right = new TreeNode(10);
    assertEquals(Arrays.asList(1, 2, 4, 7, 8, 9, 10, 6, 3), solution.boundaryOfBinaryTree(root));
  }
}
