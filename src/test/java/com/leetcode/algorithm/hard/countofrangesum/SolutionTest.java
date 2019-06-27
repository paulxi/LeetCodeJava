package com.leetcode.algorithm.hard.countofrangesum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.countRangeSum(new int[] {-2, 5, -1}, -2, 2));
  }
}
