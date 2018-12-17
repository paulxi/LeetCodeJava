package com.leetcode.algorithm.medium.findlargestvalueineachtreerow;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(3);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(9);

    assertEquals(Arrays.asList(1, 3, 9), solution.largestValues(root));
  }
}
