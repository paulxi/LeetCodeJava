package com.leetcode.algorithm.medium.asteroidcollision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {5, 10}, solution.asteroidCollision(new int[] {5, 10, -5}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {}, solution.asteroidCollision(new int[] {8, -8}));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {10}, solution.asteroidCollision(new int[] {10, 2, -5}));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertArrayEquals(new int[] {-2, -1, 1, 2}, solution.asteroidCollision(new int[] {-2, -1, 1, 2}));
  }
}
