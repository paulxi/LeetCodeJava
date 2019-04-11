package com.leetcode.algorithm.medium.minimumsizesubarraysum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
  }
}
