package com.leetcode.algorithm.medium.palindromepartitioning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(Arrays.asList("a", "a", "b"), Arrays.asList("aa", "b")), solution.partition("aab"));
  }
}
