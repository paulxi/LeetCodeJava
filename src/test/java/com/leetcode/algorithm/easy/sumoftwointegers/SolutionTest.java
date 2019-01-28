package com.leetcode.algorithm.easy.sumoftwointegers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.getSum(1, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.getSum(-2, 3));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.getSubtract(3, 2));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(-5, solution.getSubtract(-2, 3));
  }
}
