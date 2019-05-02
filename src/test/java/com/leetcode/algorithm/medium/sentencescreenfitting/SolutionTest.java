package com.leetcode.algorithm.medium.sentencescreenfitting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(1, solution.wordsTyping(new String[] {"hello", "world"}, 2, 8));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(2, solution.wordsTyping(new String[] {"a", "bcd", "e"}, 3, 6));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(1, solution.wordsTyping(new String[] {"I", "had", "apple", "pie"}, 4, 5));
  }
}
