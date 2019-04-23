package com.leetcode.algorithm.hard.stampingthesequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 2}, solution.movesToStamp("abc", "ababc"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {0, 3, 1}, solution.movesToStamp("abca", "aabcaca"));
  }
}
