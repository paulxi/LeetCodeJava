package com.leetcode.algorithm.medium.groupshiftedstrings;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            Arrays.asList("a", "z"),
            Arrays.asList("az", "ba"),
            Arrays.asList("abc", "bcd", "xyz"),
            Arrays.asList("acef")),
        solution.groupStrings(new String[] {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"}));
  }
}
