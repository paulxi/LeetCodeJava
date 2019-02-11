package com.leetcode.algorithm.hard.splitarraylargestsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(18, solution.splitArray(new int[] {7,2,5,10,8}, 2));
  }
}
