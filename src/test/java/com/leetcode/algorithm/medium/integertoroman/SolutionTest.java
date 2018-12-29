package com.leetcode.algorithm.medium.integertoroman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("III", solution.intToRoman(3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("IV", solution.intToRoman(4));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("IX", solution.intToRoman(9));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals("LVIII", solution.intToRoman(58));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals("MCMXCIV", solution.intToRoman(1994));
  }
}
