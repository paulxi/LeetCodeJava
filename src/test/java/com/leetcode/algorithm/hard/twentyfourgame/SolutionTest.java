package com.leetcode.algorithm.hard.twentyfourgame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.judgePoint24(new int[] {4, 1, 8, 7}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.judgePoint24(new int[] {1, 2, 1, 2}));
  }
}
