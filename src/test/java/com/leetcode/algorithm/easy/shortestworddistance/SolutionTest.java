package com.leetcode.algorithm.easy.shortestworddistance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    String[] words = {"practice", "makes", "perfect", "coding", "makes"};
    assertEquals(3, solution.shortestDistance(words, "coding", "practice"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    String[] words = {"practice", "makes", "perfect", "coding", "makes"};
    assertEquals(1, solution.shortestDistance(words, "makes", "coding"));
  }
}
