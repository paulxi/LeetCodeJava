package com.leetcode.algorithm.medium.spiralmatrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), solution.spiralOrder(new int[][] {
        {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), solution.spiralOrder(new int[][] {
        {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
    }));
  }
}
