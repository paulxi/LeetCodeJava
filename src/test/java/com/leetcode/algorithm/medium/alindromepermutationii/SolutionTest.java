package com.leetcode.algorithm.medium.alindromepermutationii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("abba", "baab"), solution.generatePalindromes("aabb"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(), solution.generatePalindromes("abc"));
  }
}
