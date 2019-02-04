package com.leetcode.algorithm.hard.maximumvacationdays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(12, solution.maxVacationDays(new int[][] {
        {0, 1, 1}, {1, 0, 1}, {1, 1, 0}
    }, new int[][] {
        {1, 3, 1}, {6, 0, 3}, {3, 3, 3}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.maxVacationDays(new int[][] {
        {0, 0, 0}, {0, 0, 0}, {0, 0, 0}
    }, new int[][] {
        {1, 1, 1}, {7, 7, 7}, {7, 7, 7}
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(21, solution.maxVacationDays(new int[][] {
        {0, 1, 1}, {1, 0, 1}, {1, 1, 0}
    }, new int[][] {
        {7, 0, 0}, {0, 7, 0}, {0, 0, 7}
    }));
  }
}
