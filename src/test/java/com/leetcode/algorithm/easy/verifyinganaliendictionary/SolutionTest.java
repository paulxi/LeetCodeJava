package com.leetcode.algorithm.easy.verifyinganaliendictionary;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertTrue(solution.isAlienSorted(new String[] {"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertFalse(solution.isAlienSorted(new String[] {"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertFalse(solution.isAlienSorted(new String[] {"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
  }
}
