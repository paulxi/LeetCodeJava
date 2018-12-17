package com.leetcode.algorithm.easy.flippinganimage;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[][] expected = new int[][] {{1,0,0}, {0,1,0}, {1,1,1}};
    assertArrayEquals(expected, solution.flipAndInvertImage(new int[][] {{1,1,0}, {1,0,1}, {0,0,0}}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[][] expected = new int[][] {{1,1,0,0}, {0,1,1,0}, {0,0,0,1}, {1,0,1,0}};
    assertArrayEquals(expected, solution.flipAndInvertImage(new int[][] {{1,1,0,0}, {1,0,0,1}, {0,1,1,1}, {1,0,1,0}}));
  }
}
