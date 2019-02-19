package com.leetcode.algorithm.medium.findallduplicatesinanarray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(2, 3), solution.findDuplicates(new int[] {4, 3, 2, 7, 8, 2, 3, 1}));
  }
}
