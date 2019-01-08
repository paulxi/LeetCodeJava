package com.leetcode.algorithm.medium.printallstrings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("abcdfgh", "abcdfij", "abcefgh", "abcefij"),
        solution.allStrings("abc{d,e}f{gh,ij}"));
  }
}
