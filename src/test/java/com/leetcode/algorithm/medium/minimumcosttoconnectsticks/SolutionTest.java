package com.leetcode.algorithm.medium.minimumcosttoconnectsticks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(14, solution.connectSticks(new int[] {2, 4, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(30, solution.connectSticks(new int[] {1, 8, 3, 5}));
  }
}
