package com.leetcode.algorithm.medium.binarytreerightsideview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.left.right = new TreeNode(5);
    root.right = new TreeNode(3);
    root.right.right = new TreeNode(4);

    List<List<Integer>> result = Arrays.asList(Arrays.asList(3),
        Arrays.asList(9, 20),
        Arrays.asList(15, 7));

    assertEquals(Arrays.asList(1, 3, 4),
        solution.rightSideView(root));
  }
}
