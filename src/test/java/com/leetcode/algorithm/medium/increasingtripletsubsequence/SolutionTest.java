package com.leetcode.algorithm.medium.increasingtripletsubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.increasingTriplet(new int[]{1,2,3,4,5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.increasingTriplet(new int[]{5,4,3,2,1}));
  }
}
