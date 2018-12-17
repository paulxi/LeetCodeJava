package com.leetcode.algorithm.medium.maximumproductsubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.maxProduct(new int[]{2,3,-2,4}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.maxProduct(new int[]{-2,0,-1}));
  }
}
