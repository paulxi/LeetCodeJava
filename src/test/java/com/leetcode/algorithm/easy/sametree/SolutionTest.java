package com.leetcode.algorithm.easy.sametree;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(3);

    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(2);
    q.right = new TreeNode(3);

    assertEquals(true, solution.isSameTree(p, q));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);

    TreeNode q = new TreeNode(1);
    q.right = new TreeNode(2);

    assertEquals(false, solution.isSameTree(p, q));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode p = new TreeNode(1);
    p.left = new TreeNode(2);
    p.right = new TreeNode(1);

    TreeNode q = new TreeNode(1);
    q.left = new TreeNode(1);
    q.right = new TreeNode(2);

    assertEquals(false, solution.isSameTree(p, q));
  }
}
