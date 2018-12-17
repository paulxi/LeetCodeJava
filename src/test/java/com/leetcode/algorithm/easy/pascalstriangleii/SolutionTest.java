package com.leetcode.algorithm.easy.pascalstriangleii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 3, 3, 1), solution.getRow(3));
  }
}
