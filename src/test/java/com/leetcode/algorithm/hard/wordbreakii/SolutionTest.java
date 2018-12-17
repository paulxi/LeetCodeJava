package com.leetcode.algorithm.hard.wordbreakii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(Arrays.asList("cat sand dog", "cats and dog"),
        solution.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(Arrays.asList("pine applepen apple", "pineapple pen apple", "pine apple pen apple"),
        solution.wordBreak("pineapplepenapple", Arrays.asList("apple", "pen", "applepen", "pine", "pineapple")));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals(Arrays.asList(),
        solution.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
  }
}
