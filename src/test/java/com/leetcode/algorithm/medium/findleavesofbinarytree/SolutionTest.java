package com.leetcode.algorithm.medium.findleavesofbinarytree;

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
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);

    assertEquals(Arrays.asList(Arrays.asList(4, 5, 3), Arrays.asList(2), Arrays.asList(1)),
        solution.findLeaves(root));
  }
}
