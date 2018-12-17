package com.leetcode.algorithm.medium.graycode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(Arrays.asList(0, 1, 3, 2), solution.grayCode(2));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(Arrays.asList(0), solution.grayCode(0));
  }
}
