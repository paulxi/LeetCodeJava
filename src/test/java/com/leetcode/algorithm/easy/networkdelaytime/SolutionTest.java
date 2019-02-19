package com.leetcode.algorithm.easy.networkdelaytime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(10, solution.networkDelayTime(new int[][] {
        {1, 3, 5}, {2, 3, 3}, {1, 2, 10}
    }, 3, 1));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.networkDelayTime(new int[][] {
        {1, 2, 1}, {2, 3, 2}, {1, 3, 2}
    }, 3, 1));
  }
}
