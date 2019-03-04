package com.leetcode.algorithm.hard.wordsquares;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList("wall", "area", "lead", "lady"),
        Arrays.asList("ball", "area", "lead", "lady")),
        solution.wordSquares(new String[] {"area","lead","wall","lady","ball"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(
        Arrays.asList("baba", "abat", "baba", "atal"),
        Arrays.asList("baba", "abat", "baba", "atan")),
        solution.wordSquares(new String[] {"abat","baba","atan","atal"}));
  }
}
