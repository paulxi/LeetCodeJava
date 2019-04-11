package com.leetcode.algorithm.easy.wordpattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
  }
}
