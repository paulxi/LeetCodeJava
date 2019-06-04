package com.leetcode.algorithm.medium.lengthoflongestfibonaccisubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.lenLongestFibSubseq(new int[] {1, 2, 3, 4, 5, 6, 7, 8}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(3, solution.lenLongestFibSubseq(new int[] {1, 3, 7, 11, 12, 14, 18}));
  }
}
