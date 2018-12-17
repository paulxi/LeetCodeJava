package com.leetcode.algorithm.easy.rotatearray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] input = {1, 2, 3, 4, 5, 6, 7};
    solution.rotate(input, 3);
    assertArrayEquals(new int[] {5, 6, 7, 1, 2, 3, 4}, input);
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    int[] input = {-1, -100, 3, 99};
    solution.rotate(input, 2);
    assertArrayEquals(new int[] {3, 99, -1, -100}, input);
  }
}
