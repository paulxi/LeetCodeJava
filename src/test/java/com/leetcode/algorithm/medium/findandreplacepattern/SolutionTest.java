package com.leetcode.algorithm.medium.findandreplacepattern;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList("mee","aqq"),
        solution.findAndReplacePattern(
            new String[] {"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
  }
}
