package com.leetcode.algorithm.hard.frogjump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.canCross(new int[]{0,1,3,5,6,8,12,17}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.canCross(new int[]{0,1,2,3,4,8,9,11}));
  }
}
