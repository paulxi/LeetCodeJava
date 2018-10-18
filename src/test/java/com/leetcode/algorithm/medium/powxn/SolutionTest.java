package com.leetcode.algorithm.medium.powxn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1024.0, solution.myPow(2.0, 10));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(9.26100, solution.myPow(2.1, 3), 0.01);
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0.25, solution.myPow(2.0, -2));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(0.0, solution.myPow(2.0, -2147483648), 0.01);
  }
}
