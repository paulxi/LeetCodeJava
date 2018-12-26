package com.leetcode.algorithm.medium.threesumsmaller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.threeSumSmaller(new int[]{-2,0,1,3}, 2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.threeSumSmaller(new int[]{-1,1,-1,-1}, -1));
  }
}
