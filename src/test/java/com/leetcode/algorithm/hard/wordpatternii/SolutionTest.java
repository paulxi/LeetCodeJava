package com.leetcode.algorithm.hard.wordpatternii;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(true, solution.wordPatternMatch("abab", "redblueredblue"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(true, solution.wordPatternMatch("aaaa", "asdasdasdasd"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals(false, solution.wordPatternMatch("aabb", "xyzabcxzyabc"));
  }
}
