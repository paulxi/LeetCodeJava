package com.leetcode.algorithm.medium.constructbinarytreefromstring;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);

    assertEquals(root, solution.str2tree("4(2(3)(1))(6(5))"));
  }
}
