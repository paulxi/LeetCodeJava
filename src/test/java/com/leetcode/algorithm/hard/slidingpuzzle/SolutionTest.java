package com.leetcode.algorithm.hard.slidingpuzzle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1,
        solution.slidingPuzzle(new int[][] {
            {1,2,3}, {4, 0, 5}
        }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(-1,
        solution.slidingPuzzle(new int[][] {
            {1,2,3}, {5, 4, 0}
        }));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(5,
        solution.slidingPuzzle(new int[][] {
            {4,1,2}, {5, 0, 3}
        }));
  }
}
