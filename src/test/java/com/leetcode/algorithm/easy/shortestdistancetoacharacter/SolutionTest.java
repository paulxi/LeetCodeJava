package com.leetcode.algorithm.easy.shortestdistancetoacharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0},
        solution.shortestToChar("loveleetcode", 'e'));
  }
}
