package com.leetcode.algorithm.hard.oddevenjump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.oddEvenJumps(new int[] {10, 13, 12, 14, 15}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.oddEvenJumps(new int[] {2, 3, 1, 1, 4}));
  }
}
