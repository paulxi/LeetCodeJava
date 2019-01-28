package com.leetcode.algorithm.medium.minimumpathsum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(7,
        solution.minPathSum(new int[][] {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        }));
  }
}
