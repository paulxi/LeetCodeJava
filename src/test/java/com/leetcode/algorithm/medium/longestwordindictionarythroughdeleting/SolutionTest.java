package com.leetcode.algorithm.medium.longestwordindictionarythroughdeleting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        "apple",
        solution.findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea")));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("a", solution.findLongestWord("abpcplea", Arrays.asList("a", "b", "c")));
  }
}
