package com.leetcode.algorithm.easy.findthetownjudge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.findJudge(2, new int[][] {{1, 2}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.findJudge(3, new int[][] {{1, 3}, {2, 3}}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(-1, solution.findJudge(3, new int[][] {{1, 3}, {2, 3}, {3, 1}}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(-1, solution.findJudge(3, new int[][] {{1, 2}, {2, 3}}));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(3, solution.findJudge(4, new int[][] {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}));
  }
}
