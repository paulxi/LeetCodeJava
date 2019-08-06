package com.leetcode.algorithm.hard.recoveratreefrompreordertraversal;

import com.leetcode.algorithm.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    TreeNode expected = new TreeNode(1);
    expected.left = new TreeNode(2);
    expected.left.left = new TreeNode(3);
    expected.left.right = new TreeNode(4);
    expected.right = new TreeNode(5);
    expected.right.left = new TreeNode(6);
    expected.right.right = new TreeNode(7);
    assertEquals(expected, solution.recoverFromPreorder("1-2--3--4-5--6--7"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    TreeNode expected = new TreeNode(1);
    expected.left = new TreeNode(2);
    expected.left.left = new TreeNode(3);
    expected.left.left.left = new TreeNode(4);
    expected.right = new TreeNode(5);
    expected.right.left = new TreeNode(6);
    expected.right.left.left = new TreeNode(7);
    assertEquals(expected, solution.recoverFromPreorder("1-2--3---4-5--6---7"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    TreeNode expected = new TreeNode(1);
    expected.left = new TreeNode(401);
    expected.left.left = new TreeNode(349);
    expected.left.right = new TreeNode(88);
    expected.left.left.left = new TreeNode(90);
    assertEquals(expected, solution.recoverFromPreorder("1-401--349---90--88"));
  }
}
