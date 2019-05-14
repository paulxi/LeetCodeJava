package com.leetcode.algorithm.medium.camelcasematching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(true, false, true, true, false),
        solution.camelMatch(
            new String[] {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"},
            "FB"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(true, false, true, false, false),
        solution.camelMatch(
            new String[] {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"},
            "FoBa"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(false, true, false, false, false),
        solution.camelMatch(
            new String[] {"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"},
            "FoBaT"));
  }
}
