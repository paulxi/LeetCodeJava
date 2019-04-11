package com.leetcode.algorithm.medium.maxsumcircularsubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.maxSubarraySumCircular(new int[] {1, -2, 3, -2}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(10, solution.maxSubarraySumCircular(new int[] {5, -3, 5}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(4, solution.maxSubarraySumCircular(new int[] {3, -1, 2, -1}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(3, solution.maxSubarraySumCircular(new int[] {3, -2, 2, -3}));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals(-1, solution.maxSubarraySumCircular(new int[] {-2, -3, -1}));
  }
}
