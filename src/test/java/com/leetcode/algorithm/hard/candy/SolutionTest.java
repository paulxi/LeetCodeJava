package com.leetcode.algorithm.hard.candy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(5, solution.candy(new int[] {1, 0, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(4, solution.candy(new int[] {1, 2, 2}));
  }
}
