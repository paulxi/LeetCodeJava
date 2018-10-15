package com.leetcode.algorithm.easy.mostcommonword;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("ball", solution.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("ball", solution.mostCommonWord("Bob. hIt, baLl", new String[] {"bob", "hit"}));
  }
}
