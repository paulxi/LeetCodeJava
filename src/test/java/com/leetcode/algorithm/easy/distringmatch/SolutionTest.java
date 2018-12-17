package com.leetcode.algorithm.easy.distringmatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 4, 1, 3, 2}, solution.diStringMatch("IDID"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 1, 2, 3}, solution.diStringMatch("III"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {3, 2, 0, 1}, solution.diStringMatch("DDI"));
  }
}
