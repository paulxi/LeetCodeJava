package com.leetcode.algorithm.hard.concatenatedwords;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList("catsdogcats","dogcatsdog","ratcatdogcat"),
        solution.findAllConcatenatedWordsInADict(
            new String[] {
              "cat",
              "cats",
              "catsdogcats",
              "dog",
              "dogcatsdog",
              "hippopotamuses",
              "rat",
              "ratcatdogcat"
            }));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList(),solution.findAllConcatenatedWordsInADict(new String[] {""}));
  }
}
