package com.leetcode.algorithm.easy.reversevowelsofastring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("holle", solution.reverseVowels("hello"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("leotcede", solution.reverseVowels("leetcode"));
  }
}
