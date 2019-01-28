package com.leetcode.algorithm.easy.subtreeofanothertree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode s = new TreeNode(3);
    s.left = new TreeNode(4);
    s.right = new TreeNode(5);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);

    TreeNode t = new TreeNode(4);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);

    assertEquals(true, solution.isSubtree(s, t));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode s = new TreeNode(3);
    s.left = new TreeNode(4);
    s.right = new TreeNode(5);
    s.left.left = new TreeNode(1);
    s.left.right = new TreeNode(2);
    s.left.right.left = new TreeNode(0);

    TreeNode t = new TreeNode(4);
    t.left = new TreeNode(1);
    t.right = new TreeNode(2);

    assertEquals(false, solution.isSubtree(s, t));
  }
}
