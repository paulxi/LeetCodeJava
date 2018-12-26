package com.leetcode.algorithm.medium.decodestring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();

    assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
  }
}
