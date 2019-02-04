package com.leetcode.algorithm.medium.findduplicatesubtrees;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(4);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    root.right.left.left = new TreeNode(4);
    root.right.right = new TreeNode(4);

    assertEquals(Arrays.asList(root.left.left, root.right.left), solution.findDuplicateSubtrees(root));
  }
}
