package com.leetcode.algorithm.medium.randompointinnonoverlappingrectangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution(new int[][] {{1, 1, 5, 5}});
    int[] point = solution.pick();
    assertTrue(point[0] >= 1 && point[0] <= 5 && point[1] >= 1 && point[1] <= 5);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution(new int[][] {{-2, -2, -1, -1}, {1, 0, 3, 0}});
    int[] point = solution.pick();
    assertTrue((point[0] >= -2 && point[0] <= -1 && point[1] >= -2 && point[1] <= -1)
    || (point[0] >= 1 && point[0] <= 3 && point[1] == 0));
  }
}
