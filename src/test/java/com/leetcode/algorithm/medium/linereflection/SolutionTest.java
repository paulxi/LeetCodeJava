package com.leetcode.algorithm.medium.linereflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isReflected(new int[][] {{1, 1}, {-1, 1}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.isReflected(new int[][] {{1, 1}, {-1, -1}}));
  }
}
