package com.leetcode.algorithm.medium.numberofmatchingsubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(3, solution.numMatchingSubseq("abcde", new String[] {"a", "bb", "acd", "ace"}));
  }
}
