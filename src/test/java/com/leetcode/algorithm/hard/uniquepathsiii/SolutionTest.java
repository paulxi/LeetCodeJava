package com.leetcode.algorithm.hard.uniquepathsiii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.uniquePathsIII(new int[][] {{1,0,0,0},{0,0,0,0},{0,0,2,-1}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.uniquePathsIII(new int[][] {{1,0,0,0},{0,0,0,0},{0,0,0,2}}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0, solution.uniquePathsIII(new int[][] {{0,1},{2,0}}));
  }
}
