package com.leetcode.algorithm.easy.powerofthree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isPowerOfThree(27));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.isPowerOfThree(0));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.isPowerOfThree(9));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(false, solution.isPowerOfThree(45));
  }
}
