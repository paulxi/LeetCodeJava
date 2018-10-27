package com.leetcode.algorithm.hard.kemptyslots;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(2, solution.kEmptySlots(new int[] {1, 3, 2}, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(-1, solution.kEmptySlots(new int[] {1, 2, 3}, 1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals(8, solution.kEmptySlots(new int[] {6, 5, 8, 9, 7, 1, 10, 2, 3, 4}, 2));
  }
}
