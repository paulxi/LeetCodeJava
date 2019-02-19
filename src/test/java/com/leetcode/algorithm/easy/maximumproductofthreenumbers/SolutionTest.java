package com.leetcode.algorithm.easy.maximumproductofthreenumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.maximumProduct(new int[] {1, 2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(24, solution.maximumProduct(new int[] {1, 2, 3, 4}));
  }
}
