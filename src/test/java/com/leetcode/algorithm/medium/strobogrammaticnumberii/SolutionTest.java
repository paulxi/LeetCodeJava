package com.leetcode.algorithm.medium.strobogrammaticnumberii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(Arrays.asList("11","88","69","96"), solution.findStrobogrammatic(2));
  }
}
