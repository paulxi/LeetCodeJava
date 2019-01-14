package com.leetcode.algorithm.medium.threesumwithmultiplicity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(20, solution.threeSumMulti(new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, 8));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(12, solution.threeSumMulti(new int[] {1, 1, 2, 2, 2, 2}, 5));
  }
}
