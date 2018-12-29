package com.leetcode.algorithm.hard.jumpgameii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.jump(new int[]{2,3,1,1,4}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.jump(new int[]{2,3,0,1,4}));
  }
}
