package com.leetcode.algorithm.medium.binarytreelevelordertraversal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    List<List<Integer>> result = Arrays.asList(Arrays.asList(3),
        Arrays.asList(9, 20),
        Arrays.asList(15, 7));

    assertEquals(result,
        solution.levelOrder(root));
  }
}
