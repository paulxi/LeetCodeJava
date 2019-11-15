package com.leetcode.algorithm.medium.previouspermutationwithoneswap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {3, 1, 2}, solution.prevPermOpt1(new int[] {3, 2, 1}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 1, 5}, solution.prevPermOpt1(new int[] {1, 1, 5}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 7, 4, 6, 9}, solution.prevPermOpt1(new int[] {1, 9, 4, 6, 7}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {1, 3, 1, 3}, solution.prevPermOpt1(new int[] {3, 1, 1, 3}));
  }
}
