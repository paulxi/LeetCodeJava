package com.leetcode.algorithm.easy.kdiffpairsinanarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.findPairs(new int[] {3, 1, 4, 1, 5}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.findPairs(new int[] {1, 2, 3, 4, 5}, 1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.findPairs(new int[] {1, 3, 1, 5, 4},0));
  }
}
