package com.leetcode.algorithm.medium.majorityelementii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(3), solution.majorityElement(new int[] {3, 2, 3}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 2), solution.majorityElement(new int[] {1, 1, 1, 3, 3, 2, 2, 2}));
  }
}
