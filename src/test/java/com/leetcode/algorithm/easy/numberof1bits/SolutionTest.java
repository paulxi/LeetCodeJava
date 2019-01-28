package com.leetcode.algorithm.easy.numberof1bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.hammingWeight(11));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(1, solution.hammingWeight(128));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(31, solution.hammingWeight(-3));
  }
}
