package com.leetcode.algorithm.easy.excelsheetcolumnnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.titleToNumber("A"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(28, solution.titleToNumber("AB"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(701, solution.titleToNumber("ZY"));
  }
}
