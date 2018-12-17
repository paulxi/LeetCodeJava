package com.leetcode.algorithm.medium.findpeakelement;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(2, solution.findPeakElement(new int[] {1, 2, 3, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(true, Arrays.asList(1, 5).contains(
        solution.findPeakElement(new int[] {1, 2, 1, 3, 5, 6, 4})));
  }
}
