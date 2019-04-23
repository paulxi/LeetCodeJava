package com.leetcode.algorithm.medium.flipstringtomonotoneincreasing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.minFlipsMonoIncr("00110"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.minFlipsMonoIncr("010110"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(2, solution.minFlipsMonoIncr("00011000"));
  }
}
