package com.leetcode.algorithm.medium.uglynumberii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(12, solution.nthUglyNumber(10));
  }
}
