package com.leetcode.algorithm.medium.circulararrayloop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.circularArrayLoop(new int[] {2, -1, 1, 2, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.circularArrayLoop(new int[] {-1, 2}));
  }
}
