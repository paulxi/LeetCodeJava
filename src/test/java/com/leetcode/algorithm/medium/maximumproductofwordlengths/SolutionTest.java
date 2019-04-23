package com.leetcode.algorithm.medium.maximumproductofwordlengths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();

    assertEquals(
        16, solution.maxProduct(new String[] {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();

    assertEquals(4, solution.maxProduct(new String[] {"a", "ab", "abc", "d", "cd", "bcd", "abcd"}));
  }
}
