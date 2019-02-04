package com.leetcode.algorithm.hard.numberofislandsii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 1, 2, 3), solution.numIslands2(3, 3, new int[][] {
        {0, 0}, {0, 1}, {1, 2}, {2, 1}
    }));
  }
}
