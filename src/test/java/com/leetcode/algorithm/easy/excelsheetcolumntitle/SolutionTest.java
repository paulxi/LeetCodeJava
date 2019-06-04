package com.leetcode.algorithm.easy.excelsheetcolumntitle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("A", solution.convertToTitle(1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("AB", solution.convertToTitle(28));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("ZY", solution.convertToTitle(701));
  }
}
