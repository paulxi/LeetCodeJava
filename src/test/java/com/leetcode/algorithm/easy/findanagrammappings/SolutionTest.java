package com.leetcode.algorithm.easy.findanagrammappings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 4, 3, 2, 0}, solution.anagramMappings(new int[] {12, 28, 46, 32, 50}, new int[] {50, 12, 32, 46, 28}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {5, 4, 3, 4, 3, 5}, solution.anagramMappings(new int[] {21, 5, 74, 5, 74, 21}, new int[] {21, 5, 74, 74, 5, 21}));
  }
}
