package com.leetcode.algorithm.hard.braceexpansionii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("acd","ace","bcd","bce"), solution.braceExpansionII("{a,b}{c{d,e}}"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("a","ab","ac","z"), solution.braceExpansionII("{{a,z},a{b,c},{ab,z}}"));
  }
}
