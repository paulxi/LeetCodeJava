package com.leetcode.algorithm.medium.factorcombinations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(), solution.getFactors(1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(), solution.getFactors(37));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList(2, 2, 2, 2, 2),
        Arrays.asList(2, 2, 2, 4),
        Arrays.asList(2, 2, 8),
        Arrays.asList(2, 4, 4),
        Arrays.asList(2, 16),
        Arrays.asList(4, 8)
    ), solution.getFactors(32));
  }
}
