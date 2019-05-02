package com.leetcode.algorithm.hard.wordabbreviation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList("l2e", "god", "internal", "me", "i6t", "interval", "inte4n", "f2e", "intr4n"),
        solution.wordsAbbreviation(
            Arrays.asList(
                "like",
                "god",
                "internal",
                "me",
                "internet",
                "interval",
                "intension",
                "face",
                "intrusion")));
  }
}
