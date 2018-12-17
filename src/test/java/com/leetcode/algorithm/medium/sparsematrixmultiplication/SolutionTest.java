package com.leetcode.algorithm.medium.sparsematrixmultiplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[][] matrix1 = new int[][] {{1, 0, 0}, {-1, 0, 3}};
    int[][] matrix2 = new int[][] {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
    int[][] expected = new int[][] {{7, 0, 0}, {-7, 0, 3}};
    assertArrayEquals(expected, solution.multiply(matrix1, matrix2));
  }
}
