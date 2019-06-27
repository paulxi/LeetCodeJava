package com.leetcode.algorithm.easy.highfive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(
        new int[][] {{1, 87}, {2, 88}},
        solution.highFive(
            new int[][] {
              {1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100},
              {2, 100}, {2, 76}
            }));
  }
}
