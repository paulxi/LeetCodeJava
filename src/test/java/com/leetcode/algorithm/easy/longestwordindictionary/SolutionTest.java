package com.leetcode.algorithm.easy.longestwordindictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("world", solution.longestWord(new String[] {"w","wo","wor","worl", "world"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("apple", solution.longestWord(new String[] {"a", "banana", "app", "appl", "ap", "apply", "apple"}));
  }
}
