package com.leetcode.algorithm.hard.kthsmallestnumberinmultiplicationtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(3, solution.findKthNumber(3, 3, 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(6, solution.findKthNumber(2, 3, 6));
  }
}
