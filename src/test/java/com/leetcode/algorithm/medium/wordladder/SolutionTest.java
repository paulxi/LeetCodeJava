package com.leetcode.algorithm.medium.wordladder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(5, solution.ladderLength("hit", "cog",
        Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.ladderLength("hit", "cog",
        Arrays.asList("hot", "dot", "dog", "lot", "log")));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(0, solution.ladderLength("hot", "dog",
        Arrays.asList("hot", "dog")));
  }
}
