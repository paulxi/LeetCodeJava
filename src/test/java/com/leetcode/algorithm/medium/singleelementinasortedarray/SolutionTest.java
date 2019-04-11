package com.leetcode.algorithm.medium.singleelementinasortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(10, solution.singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
  }
}
