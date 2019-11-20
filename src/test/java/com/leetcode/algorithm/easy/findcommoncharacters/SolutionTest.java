package com.leetcode.algorithm.easy.findcommoncharacters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList("e", "l", "l"),
        solution.commonChars(new String[] {"bella", "label", "roller"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList("c", "o"), solution.commonChars(new String[] {"cool", "lock", "cook"}));
  }
}
