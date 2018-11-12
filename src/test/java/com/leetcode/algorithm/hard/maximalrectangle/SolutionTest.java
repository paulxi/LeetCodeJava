package com.leetcode.algorithm.hard.maximalrectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    char[][] input = {
        {'1','0','1','0','0'},
        {'1','0','1','1','1'},
        {'1','1','1','1','1'},
        {'1','0','0','1','0'}
    };
    assertEquals(6, solution.maximalRectangle(input));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    char[][] input = {
        {'0','0','0'},
        {'0','0','0'},
        {'0','0','0'},
        {'0','0','0'}
    };
    assertEquals(0, solution.maximalRectangle(input));
  }
}
