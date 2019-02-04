package com.leetcode.algorithm.medium.sortcharactersbyfrequency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("eert", solution.frequencySort("tree"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("aaaccc", solution.frequencySort("cccaaa"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("bbAa", solution.frequencySort("Aabb"));
  }
}
