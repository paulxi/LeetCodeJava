package com.leetcode.algorithm.medium.longestturbulentsubarray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testLengthOfLongestSubstringCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.maxTurbulenceSize(new int[] {9,4,2,10,7,8,8,1,9}));
  }

  @Test
  public void testLengthOfLongestSubstringCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.maxTurbulenceSize(new int[] {4,8,12,16}));
  }

  @Test
  public void testLengthOfLongestSubstringCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.maxTurbulenceSize(new int[] {100}));
  }
}
