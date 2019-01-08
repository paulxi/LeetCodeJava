package com.leetcode.algorithm.medium.besttimetobuyandsellstockwithtransactionfee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.maxProfit(new int[] {1, 3, 2, 8, 4, 9}, 2));
  }
}
