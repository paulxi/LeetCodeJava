package com.leetcode.algorithm.medium.largestnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("210", solution.largestNumber(new int[] {10, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("9534330", solution.largestNumber(new int[] {3, 30, 34, 5, 9}));
  }
}
