package com.leetcode.algorithm.medium.subarraysumequalsk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.subarraySum(new int[]{1, 1, 1}, 2));
  }
}
