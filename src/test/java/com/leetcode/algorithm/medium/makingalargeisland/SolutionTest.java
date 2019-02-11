package com.leetcode.algorithm.medium.makingalargeisland;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(3, solution.largestIsland(new int[][] {
        {1, 0}, {0, 1}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(4, solution.largestIsland(new int[][] {
        {1, 1}, {1, 0}
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals(4, solution.largestIsland(new int[][] {
        {1, 1}, {1, 1}
    }));
  }
}
