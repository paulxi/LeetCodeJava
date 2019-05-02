package com.leetcode.algorithm.medium.pyramidtransitionmatrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        true, solution.pyramidTransition("XYZ", Arrays.asList("XYD", "YZE", "DEA", "FFF")));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        false,
        solution.pyramidTransition("XXYX", Arrays.asList("XXX", "XXY", "XYX", "XYY", "YXZ")));
  }
}
