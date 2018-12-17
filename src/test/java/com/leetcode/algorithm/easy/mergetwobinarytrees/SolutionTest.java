package com.leetcode.algorithm.easy.mergetwobinarytrees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(3);
    t1.left.left = new TreeNode(5);
    t1.right = new TreeNode(2);

    TreeNode t2 = new TreeNode(2);
    t2.left = new TreeNode(1);
    t2.left.right = new TreeNode(4);
    t2.right = new TreeNode(3);
    t2.right.right = new TreeNode(7);

    TreeNode expected = new TreeNode(3);
    expected.left = new TreeNode(4);
    expected.left.left = new TreeNode(5);
    expected.left.right = new TreeNode(4);
    expected.right = new TreeNode(5);
    expected.right.right = new TreeNode(7);

    assertEquals(expected, solution.mergeTrees(t1, t2));
  }
}
