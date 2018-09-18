package com.leetcode.algorithm.medium.zigzagconversion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testZigZagConversionEmptyString() {
    Solution solution = new Solution();
    assertEquals("", solution.convert("", 3));
  }

  @Test
  public void testZigZagConversion() {
    Solution solution = new Solution();
    assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
  }
}
