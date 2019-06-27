package com.leetcode.algorithm.medium.rectanglearea;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(45,
        solution.computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
  }
}
