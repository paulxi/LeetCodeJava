package com.leetcode.algorithm.hard.medianoftwosortedarrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testFindMedianSortedArraysCase1() {
    Solution solution = new Solution();

    assertEquals(2., solution.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
  }

  @Test
  public void testFindMedianSortedArraysCase2() {
    Solution solution = new Solution();

    assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
  }

  @Test
  public void testFindMedianSortedArraysCase3() {
    Solution solution = new Solution();

    assertEquals(2.5, solution.findMedianSortedArrays(new int[]{3, 4}, new int[]{1, 2}));
  }

  @Test
  public void testFindMedianSortedArraysCase4() {
    Solution solution = new Solution();

    assertEquals(3.0, solution.findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5}));
  }

  @Test
  public void testFindMedianSortedArraysCase5() {
    Solution solution = new Solution();

    assertEquals(3.0, solution.findMedianSortedArrays(new int[]{4, 5}, new int[]{1, 2, 3}));
  }
}
