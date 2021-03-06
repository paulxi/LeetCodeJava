package com.leetcode.algorithm.medium.bulbswitcherii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.flipLights(1,1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.flipLights(2,1));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(4, solution.flipLights(3,1));
  }
}
