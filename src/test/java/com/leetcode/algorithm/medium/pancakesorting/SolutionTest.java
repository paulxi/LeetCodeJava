package com.leetcode.algorithm.medium.pancakesorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(3, 4, 2, 3, 1, 2, 1, 1), solution.pancakeSort(new int[] {3, 2, 4, 1}));
  }
}
