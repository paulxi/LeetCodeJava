package com.leetcode.algorithm.medium.revealcardsinincreasingorder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[] {2, 13, 3, 11, 5, 17, 7},
        solution.deckRevealedIncreasing(new int[] {17, 13, 11, 2, 3, 5, 7}));
  }
}
