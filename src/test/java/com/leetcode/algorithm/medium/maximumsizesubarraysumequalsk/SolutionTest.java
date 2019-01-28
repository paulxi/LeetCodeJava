package com.leetcode.algorithm.medium.maximumsizesubarraysumequalsk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.maxSubArrayLen(new int[] {1, -1, 5, -2, 3}, 3));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.maxSubArrayLen(new int[] {-2, -1, 2, 1}, 1));
  }
}
