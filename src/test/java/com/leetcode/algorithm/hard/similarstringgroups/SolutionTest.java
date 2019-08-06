package com.leetcode.algorithm.hard.similarstringgroups;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(2, solution.numSimilarGroups(new String[] {"tars", "rats", "arts", "star"}));
  }
}
