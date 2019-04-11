package com.leetcode.algorithm.medium.flipequivalentbinarytrees;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.left.left = new TreeNode(4);
    root1.left.right = new TreeNode(5);
    root1.left.right.left = new TreeNode(7);
    root1.left.right.right = new TreeNode(8);
    root1.right = new TreeNode(3);
    root1.right.left = new TreeNode(6);

    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(3);
    root2.left.right = new TreeNode(6);
    root2.right = new TreeNode(2);
    root2.right.left = new TreeNode(4);
    root2.right.right = new TreeNode(5);
    root2.right.right.left = new TreeNode(8);
    root2.right.right.right = new TreeNode(7);

    assertEquals(true, solution.flipEquiv(root1, root2));
  }
}
