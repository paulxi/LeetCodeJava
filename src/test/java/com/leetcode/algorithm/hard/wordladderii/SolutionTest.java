package com.leetcode.algorithm.hard.wordladderii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
    List<List<String>> expected = Arrays.asList(
        Arrays.asList("hit", "hot", "dot", "dog", "cog"),
        Arrays.asList("hit", "hot", "lot", "log", "cog")
    );

    assertEquals(expected,
        solution.findLadders("hit", "cog", wordList));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    List<String> wordList = Arrays.asList("hot", "dog", "dot");
    List<List<String>> expected = Arrays.asList(
        Arrays.asList("hot", "dot", "dog")
    );

    assertEquals(expected,
        solution.findLadders("hot", "dog", wordList));
  }
}
