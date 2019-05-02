package com.leetcode.algorithm.hard.encodestringwithshortestlength;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import com.leetcode.algorithm.common.Interval;
import org.junit.jupiter.api.Test;

public class SolutionTest {
  @Test
  public void testCase1() {
    Solution solution = new Solution();
    assertEquals("aaa", solution.encode("aaa"));
  }

  @Test
  public void testCase2() {
    Solution solution = new Solution();
    assertEquals("5[a]", solution.encode("aaaaa"));
  }

  @Test
  public void testCase3() {
    Solution solution = new Solution();
    assertEquals("a9[a]", solution.encode("aaaaaaaaaa"));
  }

  @Test
  public void testCase4() {
    Solution solution = new Solution();
    assertEquals("2[aabc]d", solution.encode("aabcaabcd"));
  }

  @Test
  public void testCase5() {
    Solution solution = new Solution();
    assertEquals("2[2[abbb]c]", solution.encode("abbbabbbcabbbabbbc"));
  }
}
