package com.leetcode.algorithm.medium.knightdialer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(10, solution.knightDialer(1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(20, solution.knightDialer(2));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(46, solution.knightDialer(3));
  }
}
