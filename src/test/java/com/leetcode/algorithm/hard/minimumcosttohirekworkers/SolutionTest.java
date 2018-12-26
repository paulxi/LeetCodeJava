package com.leetcode.algorithm.hard.minimumcosttohirekworkers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(105.0,
        solution.mincostToHireWorkers(new int[] {10, 20, 5}, new int[] {70, 50, 30}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(30.66667,
        solution.mincostToHireWorkers(new int[] {3,1,10,10,1}, new int[] {4,8,2,2,7}, 3),
        Math.pow(10, -5));
  }
}
