package com.leetcode.algorithm.medium.threesumclosest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.threeSumClosest(new int[]{0, 2, 1, -3}, 1));
  }
}
