package com.leetcode.algorithm.easy.movezeroes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    int[] params = {0,1,0,3,12};
    int[] expected = {1,3,12,0,0};
    solution.moveZeroes(params);
    assertArrayEquals(expected, params);
  }
}
