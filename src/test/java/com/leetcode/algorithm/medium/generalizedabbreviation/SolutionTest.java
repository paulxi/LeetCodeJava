package com.leetcode.algorithm.medium.generalizedabbreviation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(
        Arrays.asList(
            "4", "3d", "2r1", "2rd", "1o2", "1o1d", "1or1", "1ord", "w3", "w2d", "w1r1", "w1rd",
            "wo2", "wo1d", "wor1", "word"),
        solution.generateAbbreviations("word"));
  }
}
