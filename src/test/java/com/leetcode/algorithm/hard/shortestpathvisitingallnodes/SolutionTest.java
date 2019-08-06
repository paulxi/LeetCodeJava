package com.leetcode.algorithm.hard.shortestpathvisitingallnodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(4, solution.shortestPathLength(new int[][] {
        {1, 2, 3}, {0}, {0}, {0}
    }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(4, solution.shortestPathLength(new int[][] {
        {1},{0,2,4},{1,3,4},{2},{1,2}
    }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(4, solution.shortestPathLength2(new int[][] {
        {1, 2, 3}, {0}, {0}, {0}
    }));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(4, solution.shortestPathLength2(new int[][] {
        {1},{0,2,4},{1,3,4},{2},{1,2}
    }));
  }
}
