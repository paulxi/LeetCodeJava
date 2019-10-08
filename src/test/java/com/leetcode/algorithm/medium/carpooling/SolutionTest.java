package com.leetcode.algorithm.medium.carpooling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(false, solution.carPooling(new int[][] {{2,1,5}, {3,3,7}}, 4));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.carPooling(new int[][] {{2,1,5}, {3,3,7}}, 5));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(true, solution.carPooling(new int[][] {{2,1,5}, {3,5,7}}, 3));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals(true, solution.carPooling(new int[][] {{3,2,7},{3,7,9},{8,3,9}}, 11));
  }
}
