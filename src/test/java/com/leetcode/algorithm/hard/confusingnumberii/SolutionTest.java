package com.leetcode.algorithm.hard.confusingnumberii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.confusingNumberII(20));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(19, solution.confusingNumberII(100));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(10, solution.confusingNumberII(69));
  }
}
