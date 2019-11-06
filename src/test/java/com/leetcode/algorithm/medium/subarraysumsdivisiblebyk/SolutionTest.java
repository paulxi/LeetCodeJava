package com.leetcode.algorithm.medium.subarraysumsdivisiblebyk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7, solution.subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5));
  }
}
