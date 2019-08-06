package com.leetcode.algorithm.medium.pathinzigzaglabelledbinarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 3, 4, 14), solution.pathInZigZagTree(14));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(1, 2, 6, 10, 26), solution.pathInZigZagTree(26));
  }
}
