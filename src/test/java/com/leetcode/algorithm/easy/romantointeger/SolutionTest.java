package com.leetcode.algorithm.easy.romantointeger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testIII() {
    Solution solution = new Solution();
    assertEquals(3, solution.romanToInt("III"));
  }

  @Test
  public void testIV() {
    Solution solution = new Solution();
    assertEquals(4, solution.romanToInt("IV"));
  }

  @Test
  public void testIX() {
    Solution solution = new Solution();
    assertEquals(9, solution.romanToInt("IX"));
  }

  @Test
  public void testLVIII() {
    Solution solution = new Solution();
    assertEquals(58, solution.romanToInt("LVIII"));
  }

  @Test
  public void testMCMXCIV() {
    Solution solution = new Solution();
    assertEquals(1994, solution.romanToInt("MCMXCIV"));
  }
}
