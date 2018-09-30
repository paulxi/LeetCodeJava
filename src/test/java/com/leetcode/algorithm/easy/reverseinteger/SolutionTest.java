package com.leetcode.algorithm.easy.reverseinteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testPositiveNumber() {
    Solution solution = new Solution();
    assertEquals(321, solution.reverse(123));
  }

  @Test
  public void testNegativeNumber() {
    Solution solution = new Solution();
    assertEquals(-321, solution.reverse(-123));
  }

  @Test
  public void test120() {
    Solution solution = new Solution();
    assertEquals(21, solution.reverse(120));
  }
}
