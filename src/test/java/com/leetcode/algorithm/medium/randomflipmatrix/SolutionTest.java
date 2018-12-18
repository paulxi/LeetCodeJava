package com.leetcode.algorithm.medium.randomflipmatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution(2, 3);
    int[] point = solution.flip();
    assertEquals(true, point[0] >= 0 && point[0] <= 1 && point[1] >= 0 && point[1] <= 2);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution(1, 2);
    int[] point = solution.flip();
    assertEquals(true, point[0] == 0 && point[1] >= 0 && point[1] <= 1);
    solution.reset();
    assertEquals(true, point[0] == 0 && point[1] >= 0 && point[1] <= 1);
  }
}
