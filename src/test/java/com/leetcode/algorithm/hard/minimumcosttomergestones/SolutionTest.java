package com.leetcode.algorithm.hard.minimumcosttomergestones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(20, solution.mergeStones(new int[] {3, 2, 4, 1}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1, solution.mergeStones(new int[] {3, 2, 4, 1}, 3));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(25, solution.mergeStones(new int[] {3, 5, 1, 2, 6}, 3));
  }
}
