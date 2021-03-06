package com.leetcode.algorithm.medium.findklengthsubstringswithnorepeatedcharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals(6, solution.numKLenSubstrNoRepeats("havefunonleetcode", 5));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals(0, solution.numKLenSubstrNoRepeats("home", 5));
  }
}
