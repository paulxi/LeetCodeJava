package com.leetcode.algorithm.medium.uniquepaths;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.uniquePaths(3, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(28, solution.uniquePaths(7, 3));
  }
}
