package com.leetcode.algorithm.medium.searchinrotatedsortedarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4,
        solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1,
        solution.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
  }
}
