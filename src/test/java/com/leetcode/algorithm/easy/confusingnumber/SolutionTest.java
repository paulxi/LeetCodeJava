package com.leetcode.algorithm.easy.confusingnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.confusingNumber(6));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.confusingNumber(89));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false, solution.confusingNumber(11));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(false, solution.confusingNumber(25));
  }
}
