package com.leetcode.algorithm.easy.nextgreaterelementi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {-1, 3, -1}, solution.nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {3, -1}, solution.nextGreaterElement(new int[] {2, 4}, new int[] {1, 2, 3, 4}));
  }
}
