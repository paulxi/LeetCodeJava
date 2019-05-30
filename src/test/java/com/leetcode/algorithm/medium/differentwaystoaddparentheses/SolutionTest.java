package com.leetcode.algorithm.medium.differentwaystoaddparentheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(2, 0), solution.diffWaysToCompute("2-1-1"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(-34, -10, -14, -10, 10), solution.diffWaysToCompute("2*3-4*5"));
  }
}
