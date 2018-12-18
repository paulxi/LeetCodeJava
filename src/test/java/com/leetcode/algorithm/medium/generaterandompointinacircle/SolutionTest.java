package com.leetcode.algorithm.medium.generaterandompointinacircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution(1,0,0);
    double[] point = solution.randPoint();
    assertTrue(point[0] >= -1 && point[0] <= 1 && point[1] >= -1 && point[1] <= 1);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution(10,5,-7.5);
    double[] point = solution.randPoint();
    assertTrue(point[0] >= -5 && point[0] <= 15 && point[1] >= -17.5 && point[1] <= -2.5);
  }
}
