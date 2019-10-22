package com.leetcode.algorithm.medium.onethreetwopattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.find132pattern(new int[] {1, 2, 3, 4}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.find132pattern(new int[] {3, 1, 4, 2}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.find132pattern(new int[] {-1, 3, 2, 0}));
  }
}
