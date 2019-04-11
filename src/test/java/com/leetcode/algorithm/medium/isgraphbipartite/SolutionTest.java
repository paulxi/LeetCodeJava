package com.leetcode.algorithm.medium.isgraphbipartite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.isBipartite(new int[][] {
        {1,3}, {0,2}, {1,3}, {0,2}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(false, solution.isBipartite(new int[][] {
        {1,2,3}, {0,2}, {0,1,3}, {0,2}
    }));
  }
}
