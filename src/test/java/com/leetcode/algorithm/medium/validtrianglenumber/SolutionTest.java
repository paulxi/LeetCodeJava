package com.leetcode.algorithm.medium.validtrianglenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.triangleNumber(new int[] {2, 2, 3, 4}));
  }
}
